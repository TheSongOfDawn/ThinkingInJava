 �ο��������£�http://www.cnblogs.com/specter45/p/github.html
 
 Not a git repository (or any of the parent directories): .git
�����������˵���㵱ǰ��·��������һ��git�⣬������뵽���Ӧ���ļ����ڣ�git�Ĵ󲿷��������Ч.cd�����ض��Ĳֿ��ٽ��в���.
�����²ֿ��ָ�
git init //�����Ŀ¼���Git���Թ���Ĳֿ�
����git add README.md //�ļ���ӵ��ֿ�
����git add . //�������Ը���һ�ļ��������Ը�ͨ����������Ը�Ŀ¼��һ����Ͱѵ�ǰĿ¼������δ׷�ٵ��ļ�ȫ��add�� 
����git commit -m "first commit" //���ļ��ύ���ֿ�
����git remote add origin git@github.com:wangjiax9/practice.git //����Զ�ֿ̲�
����git push -u origin master //�ѱ��ؿ�������������͵�Զ�̿���

��ε�ThinkingInJava��������ҳ�˴������˲ֿ�Ȼ��clone�����أ���eclipse�ڱ����ļ��д�������Ŀ��

ִ��ָ������ļ�->�ύ�ļ�->�����ļ�
git add .

git commit -m "�ύtest1.html"

git push -u origin master
ִ����ɺ�Ϳ���������GitHub�Ͽ�����Ӧ�ı仯��

//����ҳ���޸���README.md��û�м�ʱ���±���thinkinginjava�ֿ⣬�ʲ�����git push
��������� ��git pull ���±��ط�֧ Ȼ����push���ƶ�
Git�д�Զ�̵ķ�֧��ȡ���µİ汾������������2�����
1. git fetch���൱���Ǵ�Զ�̻�ȡ���°汾�����أ������Զ�merge
    
Git fetch origin master
git log -p master..origin/master
git merge origin/master

    ��������ĺ��壺
   ���ȴ�Զ�̵�origin��master����֧�������µİ汾��origin/master��֧��
   Ȼ��Ƚϱ��ص�master��֧��origin/master��֧�Ĳ��
   �����кϲ�
   ����������ʵ���������¸������ķ�ʽ�����У�
 git fetch origin master:tmp
git diff tmp 
git merge tmp

    ��Զ�̻�ȡ���µİ汾�����ص�test��֧��
   ֮���ٽ��бȽϺϲ�
2. git pull���൱���Ǵ�Զ�̻�ȡ���°汾��merge������
 git pull origin master

����������ʵ�൱��git fetch �� git merge
��ʵ��ʹ���У�git fetch����ȫһЩ
��Ϊ��mergeǰ�����ǿ��Բ鿴���������Ȼ���پ����Ƿ�ϲ�

//
�����޸ı�gitʹ��ʱ���������� ����ĵ� ֱ��д����������ȥ


