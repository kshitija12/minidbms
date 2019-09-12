# minidbms
database needs to be created as follows

#####IMPORTANT
use on delete cascade and on update cascade on foreign key declarations
#####
mysql> use miniproject;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+-----------------------+
| Tables_in_miniproject |
+-----------------------+
| course                |
| enrolment             |
| user                  |
+-----------------------+
3 rows in set (0.00 sec)
mysql> desc course;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| courseid    | int(11)      | NO   | PRI | NULL    |       |
| course_name | varchar(30)  | NO   |     | NULL    |       |
| start       | varchar(30)  | NO   |     | NULL    |       |
| end         | varchar(30)  | NO   |     | NULL    |       |
| description | varchar(200) | NO   |     | NULL    |       |
| seats       | int(11)      | YES  |     | 5       |       |
+-------------+--------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> desc user;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| name       | varchar(20) | NO   | PRI | NULL    |       |
| password   | varchar(20) | NO   |     | NULL    |       |
| is_student | tinyint(1)  | YES  |     | 0       |       |
| is_admin   | tinyint(1)  | YES  |     | 0       |       |
+------------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> desc enrolment;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| name     | varchar(20) | NO   | PRI | NULL    |       |
| courseid | int(11)     | NO   | PRI | NULL    |       |
+----------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> insert into user values("admin","admin",false,true);
Query OK, 1 row affected (0.13 sec)
