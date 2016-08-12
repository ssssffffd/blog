USE test;

/*Table structure for table `k_blogtype` */
DROP TABLE IF EXISTS `k_blogtype`;
CREATE TABLE `k_blogtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(30) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `k_blogtype` */
insert  into `k_blogtype`(`id`,`typeName`,`orderNo`) values (1,'学习',1),(2,'工作',2),(3,'生活',3);



/*Table structure for table `k_blog` */
DROP TABLE IF EXISTS `k_blog`;
CREATE TABLE `k_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `summary` varchar(400) DEFAULT NULL,
  `releaseDate` datetime DEFAULT NULL,
  `clickHit` int(11) DEFAULT NULL,
  `replyHit` int(11) DEFAULT NULL,
  `content` text,
  `typeId` int(11) DEFAULT NULL,
  `keyWord` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `typeId` (`typeId`),
  CONSTRAINT `k_blog_ibfk_1` FOREIGN KEY (`typeId`) REFERENCES `k_blogtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `k_blog` */
insert  into `k_blog`(`id`,`title`,`summary`,`releaseDate`,`clickHit`,`replyHit`,`content`,`typeId`,`keyWord`) values
 (1,'有序二维数组的查找','在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。class Solution {    public boolean Find(int [][] array,int target) {    ','2016-08-12 11:33:39',17,0,'<p style="margin-top: 4px; margin-bottom: 4px; padding: 2px 0px; font-family: Arial, Helvetica, sans-serif; font-size: 12px; white-space: normal; background-color: rgb(255, 255, 255);">在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。</p><p style="margin-top: 4px; margin-bottom: 4px; padding: 2px 0px; font-family: Arial, Helvetica, sans-serif; font-size: 12px; white-space: normal; background-color: rgb(255, 255, 255);"><br/></p><p style="margin-top: 4px; margin-bottom: 4px; padding: 2px 0px; font-family: Arial, Helvetica, sans-serif; font-size: 12px; white-space: normal; background-color: rgb(255, 255, 255);"><br/></p><pre name="code" class="java" style="margin-top: 4px; margin-bottom: 4px; font-size: 12px; background-color: rgb(240, 240, 240);">class&nbsp;Solution&nbsp;{

&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;boolean&nbsp;Find(int&nbsp;[][]&nbsp;array,int&nbsp;target)&nbsp;{

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int&nbsp;row&nbsp;=&nbsp;array.length,&nbsp;col&nbsp;=&nbsp;array[0].length;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for(int&nbsp;c&nbsp;=&nbsp;col-1,&nbsp;r&nbsp;=&nbsp;0;&nbsp;c&nbsp;&gt;=&nbsp;0&nbsp;&amp;&amp;&nbsp;r&nbsp;&lt;&nbsp;row;&nbsp;){

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(target&nbsp;&gt;&nbsp;array[r][c])&nbsp;r++;

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else&nbsp;if(target&nbsp;&lt;&nbsp;array[r][c])&nbsp;c--;

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else&nbsp;return&nbsp;true;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;false;
&nbsp;&nbsp;&nbsp;&nbsp;}
}</pre><p><br style="font-family: Arial, Helvetica, sans-serif; font-size: 12px; white-space: normal; background-color: rgb(255, 255, 255);"/></p><p><br/></p>',1,"查找 数组")
,(2,'类加载机制','类装载器就是寻找类的字节码文件，并构造出类在JVM内部表示的对象组件。在Java中，类装载器把一个类装入JVM中，要经过以下步骤：     (1) 装载：查找和导入Class文件；     (2) 链接：把类的二进制数据合并到JRE中；        (a)校验：检查载入Class文件数据的正确性；     ','2016-08-12 11:49:34',12,0,'<p class="p0" style="margin: 10px auto; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">类装载器就是寻找类的字节码文件，并构造出类在JVM内部表示的对象组件。在Java中，类装载器把一个类装入JVM中，要经过以下步骤：</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1)&nbsp;装载：查找和导入Class文件；</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(2)&nbsp;链接：把类的二进制数据合并到JRE中；</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(a)校验：检查载入Class文件数据的正确性；</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(b)准备：给类的静态变量分配存储空间；</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(c)解析：将符号引用转成直接引用；</span></p><p class="p0" style="margin: 10px auto 10px 60px; padding: 0px; line-height: 19.5px; font-size: 13px; font-family: Verdana, Arial, Helvetica, sans-serif; white-space: normal; background-color: rgb(254, 254, 242);"><span style="margin: 0px; padding: 0px; line-height: 1.5; font-family: &#39;courier new&#39;, courier; font-size: 16px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(3)&nbsp;初始化：对类的静态变量，静态代码块执行初始化操作</span></p><p><br/></p><p><span style="font-family: &#39;courier new&#39;, courier; line-height: 24px; text-align: center; background-color: rgb(254, 254, 242);">双亲委派模型</span></p><p><img src="http://images.cnitblog.com/blog/400827/201409/172124489257909.png"/></p>',1,"加载器");



/*Table structure for table `k_user` */
DROP TABLE IF EXISTS `k_user`;
CREATE TABLE `k_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `profile` text,
  `nickName` varchar(50) DEFAULT NULL,
  `sign` varchar(100) DEFAULT NULL,
  `imageName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `k_user` */
insert  into `k_user`(`id`,`userName`,`password`,`profile`,`nickName`,`sign`,`imageName`) values (1,'kpCoder','70f57208b804bd90d51fdac84afe6472','<p>kpCoder</p><p>编程的人</p>','kpCoder','Hi','kpCoder.jpg');



/*Table structure for table `k_comment` */
DROP TABLE IF EXISTS `k_comment`;
CREATE TABLE `k_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userIp` varchar(50) DEFAULT NULL,
  `blogId` int(11) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `commentDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `k_comment` */
insert  into `k_comment`(`id`,`userIp`,`blogId`,`content`,`commentDate`,`state`) values (1,'10.200.61.54',1,'不错','2016-08-13 11:20:18',1)
,(2,'192.146.17.15',1,'感谢楼主','2016-08-13 12:20:51',1)
,(3,'0:0:0:0:0:0:0:1',2,'原来如此','2016-08-12 22:59:00',1);



/*Table structure for table `k_link` */
DROP TABLE IF EXISTS `k_link`;
CREATE TABLE `k_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `linkName` varchar(100) DEFAULT NULL,
  `linkUrl` varchar(200) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `k_link` */
insert  into `k_link`(`id`,`linkName`,`linkUrl`,`orderNo`) values (1,'kpcoder的github','https://github.com/kpcoder/',1),(2,'百度搜索引擎','http://www.baidu.com/',2),(3,'中文IT社区','http://www.csdn.net/',3);
