class NaukriPortal {

    static String[] searchJobsByCompany(String companyName) {

        String[] companies = {
            "Google","Microsoft","Amazon","Apple","Meta","Netflix","Tesla","IBM","Intel","Oracle",
            "Adobe","Salesforce","SAP","Cisco","Nvidia","Uber","Airbnb","Twitter","Spotify","Snapchat",
            "PayPal","Stripe","Square","Shopify","Zoom","Dropbox","LinkedIn","Reddit","Pinterest","Quora",
            "Flipkart","Myntra","Meesho","Swiggy","Zomato","Ola","Uber India","PhonePe","Paytm","Razorpay",
            "TCS","Infosys","Wipro","HCL","Tech Mahindra","Accenture","Capgemini","Cognizant","DXC","LTI",
            "Mindtree","Mphasis","Persistent","Zoho","Freshworks","Byjus","Unacademy","Vedantu","Coursera",
            "Udemy","Simplilearn","Bosch","Siemens","GE","Philips","Samsung","LG","Sony","Panasonic",
            "Hitachi","Dell","HP","Lenovo","Asus","Acer","Micron","Qualcomm","Broadcom",
            "Texas Instruments","AMD","MediaTek","Foxconn","Flex","Jabil","Nokia","Ericsson","Huawei",
            "Vodafone","Airtel","Jio","BSNL","Pepsi","CocaCola","Nestle","Unilever","P&G","ITC",
            "Reliance","Adani","Tata Motors","Mahindra","Maruti","Bajaj","Hero","TVS",
            "HDFC","ICICI","Axis Bank","SBI","Kotak","Yes Bank","IndusInd",
            "Goldman Sachs","JP Morgan","Morgan Stanley","Barclays","HSBC",
            "Deloitte","KPMG","EY","PwC","Grant Thornton",
            "SpaceX","Blue Origin","ISRO","DRDO","HAL",
            "MakeMyTrip","OYO","Treebo","Trivago","Expedia",
            "Snapdeal","Ajio","BigBasket","Grofers","Blinkit",
            "Swiggy Instamart","Urban Company","NoBroker","MagicBricks","99Acres",
            "PolicyBazaar","Groww","Zerodha","Upstox","Angel One",
            "CoinDCX","WazirX","Binance","Coinbase","Kraken"
        };

        for (String c : companies) {
            if (companyName.equals(c)) {
                return getJobNames();
            }
        }

        return new String[]{"No Jobs Found"};
    }

    static String[] getJobNames() {

        return new String[]{
            "Software Engineer",
            "Java Developer",
            "Python Developer",
            "Web Developer",
            "Backend Developer",
            "Frontend Developer",
            "Full Stack Developer",
            "Mobile App Developer",
            "Data Analyst",
            "Data Scientist",
            "Machine Learning Engineer",
            "AI Engineer",
            "Cloud Engineer",
            "DevOps Engineer",
            "System Engineer",
            "Network Engineer",
            "Cyber Security Analyst",
            "QA Engineer",
            "Automation Tester",
            "Product Manager"
        };
    }

    static void displayJobNames(String[] jobs) {

        for (String job : jobs) {
            System.out.println(job);
        }
        System.out.println("--------------------------------");
    }
}