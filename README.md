
##Setup h2 database in your machine.

###Step 1:

Download h2 database(Version 1.4.199 (2019-03-13), Last Stable) from http://www.h2database.com/html/download.html

###Step 2:

Create test directory under your users home directory, or wherever you like.

Example(Mac OS): `/Users/dhiraj/test`

###Step 3:

Extract the zip file under the directory which you created in `Step 2`

###Step 4:

Navigate to `h2/bin` diretory

###Step 5:

Execute below command, it will open database console in web browser

`java -jar h2-1.4.199.jar`

###Step 6:

Enter the directory which you created in Step 2

Example:
 `JDBC URL: jdbc:h2:~/test`
And don't give any password let the username as `sa` as default.

###Step 7:

Click test connection, you should be able to see message below: 

`Test successful`
