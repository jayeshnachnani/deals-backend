# deals-backend
deals-backend

deals-backend is a Spring boot application, so in order to run locally, compile the application and then Run DealsApplicationKt

After you see below lines 

Tomcat started on port(s): 5000 (http) with context path '' INFO 15734 --- [ main] com.finance.deals.DealsApplicationKt : Started DealsApplicationKt in 15.167 seconds (JVM running for 16.548)

in the console, you should be able to access http://localhost:5000/deals and see the deals in JSON format\

MChanges to be made to Android Deals project

Now you would need to add your IP at a couple of places in the Android project. In order to find your IP, follow the steps in any of the below links https://www.avast.com/c-how-to-find-ip-address?v=b OR https://lifehacker.com/how-to-find-your-local-and-external-ip-address-5833108#:~:text=Windows,is%20your%20local%20IP%20address.

Now change 192.168.1.4 to your local IP at the below 2 locations

strings.xml line 30 DealsApiService line 26
