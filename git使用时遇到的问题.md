 参考过的文章：http://www.cnblogs.com/specter45/p/github.html
 
 Not a git repository (or any of the parent directories): .git
解决方案：这说明你当前的路径并不是一个git库，必须进入到库对应的文件夹内，git的大部分命令才有效.cd进入特定的仓库再进行操作.
创建新仓库的指令：
git init //把这个目录变成Git可以管理的仓库
　　git add README.md //文件添加到仓库
　　git add . //不但可以跟单一文件，还可以跟通配符，更可以跟目录。一个点就把当前目录下所有未追踪的文件全部add了 
　　git commit -m "first commit" //把文件提交到仓库
　　git remote add origin git@github.com:wangjiax9/practice.git //关联远程仓库
　　git push -u origin master //把本地库的所有内容推送到远程库上

这次的ThinkingInJava是现在网页端创建好了仓库然后clone到本地，用eclipse在本地文件夹创建的项目。

执行指令添加文件->提交文件->推送文件
git add .

git commit -m "提交test1.html"

git push -u origin master
执行完成后就可以在网上GitHub上看到相应的变化了

//在网页端修改了README.md后没有及时更新本地thinkinginjava仓库，故不能用git push
解决方法是 先git pull 更新本地分支 然后再push到云端
Git中从远程的分支获取最新的版本到本地有这样2个命令：
1. git fetch：相当于是从远程获取最新版本到本地，不会自动merge
    
Git fetch origin master
git log -p master..origin/master
git merge origin/master

    以上命令的含义：
   首先从远程的origin的master主分支下载最新的版本到origin/master分支上
   然后比较本地的master分支和origin/master分支的差别
   最后进行合并
   上述过程其实可以用以下更清晰的方式来进行：
 git fetch origin master:tmp
git diff tmp 
git merge tmp

    从远程获取最新的版本到本地的test分支上
   之后再进行比较合并
2. git pull：相当于是从远程获取最新版本并merge到本地
 git pull origin master

上述命令其实相当于git fetch 和 git merge
在实际使用中，git fetch更安全一些
因为在merge前，我们可以查看更新情况，然后再决定是否合并

//
不再修改本git使用时遇到的问题 这个文档 直接写到博客里面去


