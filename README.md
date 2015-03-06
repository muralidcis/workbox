# workbox
Inital setup
To clone
git clone https://github.com/FormsDirect/toolkit.git

cd toolkit
git remote -v
origin	https://github.com/FormsDirect/toolkit.git (fetch)
origin	https://github.com/FormsDirect/toolkit.git (push)


git remote add upstream https://github.com/FormsDirect/toolkit.git

git fetch upstream

To remove upsteam
git remote remove upstream


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


Before any just update your git to master, so how do i do this ?

git fetch upstream
git checkout master
git merge upstream/master

git checkout -b feature-x

Do the changes 
#some work and some commits happen here

git push origin feature-x
or 
git push -f origin feature-x

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


Or the other way 

git fetch upstream
git rebase upstream/master

git checkout -b upstream upstream/master

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

How checkout tag and update in same tag 
Checkout on the same Name of the Existing tag 

Step 1:
git checkout tags/2.6.7.6
  do the changes...................

Step 2:
git commit -am ""
so
Step 3: 
I did a push like the following and end up in a mess 
git push --force origin refs/tags/2.6.7.6:refs/tags/2.6.7.6 or git push -f origin tag 2.6.7.6
Username for 'https://github.com': muralidcis
Password for 'https://muralidcis@github.com': 
Everything up-to-date,Everything up-to-date,Everything up-to-date

Step 4:
Delete the tag and then added it and then push again, it works 

git tag -d 2.6.7.6
git tag -a 2.6.7.6 -m "Executing git command using build script breaks building TK when there is no git installed"
git push --force origin refs/tags/2.6.7.6:refs/tags/2.6.7.6
Username for 'https://github.com': muralidcis
Password for 'https://muralidcis@github.com': 
Counting objects: 2, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 373 bytes | 0 bytes/s, done.
Total 2 (delta 0), reused 0 (delta 0)
To https://github.com/FormsDirect/toolkit.git
 + 9defa78...c789726 2.6.7.6 -> 2.6.7.6 (forced update)
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


Branch and tag a new tag 

Before any just update your git to master, so how do i do this ?
git checkout master
git fetch upstream
git rebase upstream/master
git push


and 
git checkout exception-handling
git rebase master
git push -f


Step 1
git branch 2.6.7.7 2.6.7.6

do changes 

Step 2 
git commit -am "branching 2.6.7.6 toolkit to 2.6.7.7,  Addition of CardholderfullName"


To see the tag version and list 
git tag -l
git describe --tags

Step 4:
git tag -a 2.6.7.7 -m "tagging 2.6.7.7 to tags"

Step 5:
git push origin tag 2.6.7.7

git tag -l to verfiy 

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





Let’s say that I’m forking the repo rails/rails. After the repo has been forked to my repository I will clone it on my local machine.

git clone git@github.com:neerajdotname/rails.git

Now cd rails and execute git remote -v . This is what I see.

origin git@github.com:neerajdotname/rails.git (fetch)
origin git@github.com:neerajdotname/rails.git (push)

Now I will add upstream remote by executing following command.

git remote add upstream git@github.com/rails/rails.git

After having done that when I execute git remote -v then I see

origin git@github.com:neerajdotname/rails.git (fetch)
origin git@github.com:neerajdotname/rails.git (push)
upstream git://github.com/rails/rails.git (fetch)
upstream git://github.com/rails/rails.git (push)

Now I want to make some changes to the code. After all this is why I forked the repo.

Let’s say that I want to add exception handling to the forked code I have locally. Then I create a branch called exception-handling and make all your changes in this branch. The key here is to not to make any changes to master branch. I try to keep master of my forked repository in sync with the master of the original repository where I forked it.

So now let’s create a branch and I will put in all my changes there.

git checkout -b exception-handling

In the Gemfile I will use this code like this

gem 'rails', github: 'neerajdotname/rails', branch: 'exception-handling'

A month has passed. In the meantime rails master has tons of changes. I want those changes in my exception-handling branch. In order to achieve that first I need to bring my local master up-to-date with rails master.

I need to switch to master branch and then I need to execute following commands.

git checkout master
git fetch upstream
git rebase upstream/master
git push

Now the master of forked repository is in-sync with the master of rails/rails. Now that master is up-to-date I need to pull in the changes in master in my exception-handling branch.

git checkout exception-handling
git rebase master
git push -f







