Feature: Login to django website and do simple inputs
@Checkout
Scenario: Login to django website and logout
Given Open browser
When go to url as "http://djangovinoth.pythonanywhere.com/login/"
And enter username as "Raghul.ps"
Then enter password as "shanthip02"
Then go to input page
And type simple inputs
Then logout from the web application