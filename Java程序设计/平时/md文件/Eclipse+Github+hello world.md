# Eclipse+Github+"hello world"（简单清楚）

[TOC]

## 下载链接

- Eclipse下载及安装：[Eclipse Downloads | The Eclipse Foundation](https://www.eclipse.org/downloads/)

- Github账号注册：[GitHub](https://github.com/)

- Github客户端下载：[GitHub Desktop | Simple collaboration from your desktop](https://desktop.github.com/)

- Java下载jdk：[Java Archive Downloads - Java SE 8 (oracle.com)](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)

## 安装

1. 将[jdk](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)、[Eclipse](https://www.eclipse.org/downloads/)、[Github客户端](https://desktop.github.com/)下载下来
2. 全默认无脑下一步安装完成

## Github仓库

### 创建一个GitHub仓库

1. 点击`Create a new repository`

取一个==项目名==，==点击==`Create repository`，仓库建立完毕

![image-20210925161159289](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925161159289.png)

### GitHub客户端

登录，==选择==你的仓库并==克隆==仓库到本地

![image-20210925162053486](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925162053486.png)

==记一下==仓库的`local path`，后面要用到

![image-20210925162158590](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925162158590.png)

## Eclipse

### 安装EGit插件

*插件地址*：**[http://download.eclipse.org/egit/updates](http://download.eclipse.org/egit/updates)**

1. `Help`->`Install New Software...`->`Add`

2. 输入地址到Location![image-20210925163019554](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925163019554.png)
3. 全选安装，重启Eclipse
4. `Windows`->`Preferences`->`Version Control(Team)`->`Git`->`Configuration`->`Add Entry`
5. 添加自己的GitHub邮箱、用户名，`Apply and Close`![image-20210925163608768](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925163608768.png)

### 创建hello world代码

1. 创建一个Java的project![image-20210925163820670](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925163820670.png)

2. 取一个名字，`finish`![image-20210925164221485](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925164221485.png)

3. 创建一个class![image-20210925164317331](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925164317331.png)

4. 取一个名字，`finish`![image-20210925164418717](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925164418717.png)

5. hello world代码

   ```java
   public class helloworld {
   	public static void main(String[] args) {
   		// TODO Auto-generated method stub
   		System.out.println("hello");
   	}
   }
   ```

   

### 创建本地仓库

1.`Team`->`Share progect`![image-20210925164707288](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925164707288.png)

2. 如图->`finish`![image-20210925165110053](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925165110053.png)
3. `Team`->`Commit`![image-20210925165223041](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925165223041.png)
4. 将需要提交文件加入Index![image-20210925165520938](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925165520938.png)
5. 在Commit Message随便写一点修改了什么，然后提交![image-20210925165651655](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925165651655.png)

### push到GitHub的仓库

1.`Team`->`Remote`->`Push`![image-20210925165758859](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925165758859.png)

2.用之前的Local Path（就是克隆到本地的GitHub仓库）填入![image-20210925170418178](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925170418178.png)

3.![image-20210925170606948](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925170606948.png)

### 由GitHub上传

1. 修改情况已经能从GitHub客户端查看
2. 点击`Publish branch`上传![image-20210925172333075](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925172333075.png)
3. GitHub上就有上传的代码啦![image-20210925172504738](https://gitee.com/star-tears233/blogimg/raw/master/img/image-20210925172504738.png)

