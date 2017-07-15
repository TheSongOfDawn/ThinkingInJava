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

