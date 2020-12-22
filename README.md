# git-desktop-repo-test
test repo created via github desktop


GitHub:

1. Create an Issue
2. Assign Issue to a team or yourself to start working on it
3. Create pull request [to get team review the changes] 
4. Once everyone signs off on the changes, you can incorporate change to head/master by ‘merging pull request’

—> how do you branch a code? [to branch a code? — e.g. to start working on an issue]


GitHub flow:

1. Craete an Issue, assign to yourself, start working on a branch [how?]
2. Once changes are ready to check-in to master, create ‘Pull request’
3. The ‘pull request’ gets reviewed by the team
4. Once all agree, ‘merge pull request’ into master branch


GitHub Repository:

1. In your local repository .gitignore file is used for tagging all files and directories that should be excluded from git repository
2. git commit used Saja <Sale@sajas-imac.local> as the committer  


To create new repository:

1. Always create new repository on GitHub first. Ideally create it completely empty.
  Note: If you create new repo with readme.md on GitHub, when you’re doing first commit of master from eclipse, you will need to check the ‘force sync’ option, otherwise commit and push will fail

2. Create a new repo locally through Eclipse plugin
    [at this point, this repo is NOT connected to the remote repo on github — this connection will happen as first push/commit]

3. Create new java project in normal Eclipse workspace location

4. By choosing ’Team’/Share Project on new project, you can nominate local repository that project should be part of — this will move the project from original workspace location to location under the chosen local repo

5. If you do then Commit, it will allow you to commit/push to remote. It’s only at this point that you will associate local repo to remote repo.
   Note: alternative to this is to create an echo “hi” >> readme.md in the new repo and initiate/link to remote via command line [this command line is shown in github when you create an empty new repository] 

Branching:

1. Create a local branch to work on a new version of code. Don’t create new branch on github to begin with.

2. When local branch is committed/pushed to remote, it will create the same branch on the remote github repo and this will also allow you to create ’new pull request’ on github associated with the new branch

3. Create new pull request on github, not locally. Once merged, you can delete the branch on github.

4. Deleting the branch on github will not delete local branch. You need to do this from Git plugin in eclipse, but make sure that before doing this, your local project is pointing to ‘master’.

5. On project, select Pull, which will then sync the latest version of the master from remote github repo to local repo and as part of this will also bring the project to latest version of the master branch.

 
