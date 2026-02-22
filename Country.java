class Country {

    public static String[] findStatesByCountry(String countryName) {
 if (countryName == "Ukraine") {
    String[] states = {
        "Vinnytsia","Volyn","Dnipropetrovsk","Donetsk","Zhytomyr",
        "Zakarpattia","Zaporizhzhia","Ivano-Frankivsk","Kyiv Oblast",
        "Kirovohrad","Luhansk","Lviv","Mykolaiv","Odessa",
        "Poltava","Rivne","Sumy","Ternopil","Kharkiv","Kherson",
        "Khmelnytskyi","Cherkasy","Chernivtsi","Chernihiv",
        "Autonomous Republic of Crimea","Kyiv","Sevastopol"
    };
    return states;
}

else if (countryName == "Japan") {
    String[] states = {
        "Hokkaido","Aomori","Iwate","Miyagi","Akita","Yamagata","Fukushima",
        "Ibaraki","Tochigi","Gunma","Saitama","Chiba","Tokyo","Kanagawa",
        "Niigata","Toyama","Ishikawa","Fukui","Yamanashi","Nagano",
        "Gifu","Shizuoka","Aichi","Mie",
        "Shiga","Kyoto","Osaka","Hyogo","Nara","Wakayama",
        "Tottori","Shimane","Okayama","Hiroshima","Yamaguchi",
        "Tokushima","Kagawa","Ehime","Kochi",
        "Fukuoka","Saga","Nagasaki","Kumamoto","Oita","Miyazaki","Kagoshima",
        "Okinawa"
    };
    return states;
}

else if (countryName == "Italy") {
    String[] states = {
        "Abruzzo","Aosta Valley","Apulia","Basilicata","Calabria",
        "Campania","Emilia-Romagna","Friuli-Venezia Giulia","Lazio","Liguria",
        "Lombardy","Marche","Molise","Piedmont","Sardinia",
        "Sicily","Trentino-Alto Adige","Tuscany","Umbria","Veneto"
    };
    return states;
}

else if (countryName == "Spain") {
    String[] states = {
        "Andalusia","Aragon","Asturias","Balearic Islands","Basque Country",
        "Canary Islands","Cantabria","Castile and Leon","Castile-La Mancha",
        "Catalonia","Extremadura","Galicia","La Rioja","Madrid",
        "Murcia","Navarre","Valencian Community"
    };
    return states;
}

else if (countryName == "Australia") {
    String[] states = {
        "New South Wales","Victoria","Queensland","South Australia",
        "Western Australia","Tasmania",
        "Northern Territory","Australian Capital Territory"
    };
    return states;
}

else if (countryName == "Brazil") {
    String[] states = {
        "Acre","Alagoas","Amapa","Amazonas","Bahia","Ceara","Espirito Santo",
        "Goias","Maranhao","Mato Grosso","Mato Grosso do Sul",
        "Minas Gerais","Para","Paraiba","Parana","Pernambuco","Piaui",
        "Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul",
        "Rondonia","Roraima","Santa Catarina","Sao Paulo","Sergipe",
        "Tocantins","Federal District"
    };
    return states;
}

else if (countryName == "Germany") {
    String[] states = {
        "Baden-Wurttemberg","Bavaria","Berlin","Brandenburg","Bremen",
        "Hamburg","Hesse","Lower Saxony","Mecklenburg-Vorpommern",
        "North Rhine-Westphalia","Rhineland-Palatinate","Saarland",
        "Saxony","Saxony-Anhalt","Schleswig-Holstein","Thuringia"
    };
    return states;
}

else if (countryName == "France") {
    String[] states = {
        "Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany",
        "Centre-Val de Loire","Corsica","Grand Est","Hauts-de-France",
        "Ile-de-France","Normandy","Nouvelle-Aquitaine","Occitanie",
        "Pays de la Loire","Provence-Alpes-Cote d'Azur",
        "Guadeloupe","Martinique","French Guiana","Reunion","Mayotte"
    };
    return states;
}

else if (countryName == "Canada") {
    String[] states = {
        "Alberta","British Columbia","Manitoba","New Brunswick",
        "Newfoundland and Labrador","Nova Scotia","Ontario",
        "Prince Edward Island","Quebec","Saskatchewan",
        "Northwest Territories","Nunavut","Yukon"
    };
    return states;
}

else if (countryName == "Mexico") {
    String[] states = {
        "Aguascalientes","Baja California","Baja California Sur","Campeche",
        "Chiapas","Chihuahua","Coahuila","Colima","Durango",
        "Guanajuato","Guerrero","Hidalgo","Jalisco","Mexico City",
        "Mexico State","Michoacan","Morelos","Nayarit","Nuevo Leon",
        "Oaxaca","Puebla","Queretaro","Quintana Roo","San Luis Potosi",
        "Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala",
        "Veracruz","Yucatan","Zacatecas"
    };
    return states;
}

else if (countryName == "South Africa") {
    String[] states = {
        "Eastern Cape","Free State","Gauteng","KwaZulu-Natal",
        "Limpopo","Mpumalanga","Northern Cape","North West","Western Cape"
    };
    return states;
}

else if (countryName == "United Kingdom") {
    String[] states = {
        "England","Scotland","Wales","Northern Ireland"
    };
    return states;
}

else if (countryName == "Turkey") {
    String[] states = {
        "Adana","Adiyaman","Afyonkarahisar","Agri","Aksaray","Amasya","Ankara",
        "Antalya","Ardahan","Artvin","Aydin","Balikesir","Bartin","Batman",
        "Bayburt","Bilecik","Bingol","Bitlis","Bolu","Burdur","Bursa","Canakkale",
        "Cankiri","Corum","Denizli","Diyarbakir","Duzce","Edirne","Elazig",
        "Erzincan","Erzurum","Eskisehir","Gaziantep","Giresun","Gumushane",
        "Hakkari","Hatay","Igdir","Isparta","Istanbul","Izmir","Kahramanmaras",
        "Karabuk","Karaman","Kars","Kastamonu","Kayseri","Kilis","Kirikkale",
        "Kirklareli","Kirsehir","Kocaeli","Konya","Kutahya","Malatya","Manisa",
        "Mardin","Mersin","Mugla","Mus","Nevsehir","Nigde","Ordu","Osmaniye",
        "Rize","Sakarya","Samsun","Sanliurfa","Siirt","Sinop","Sirnak","Sivas",
        "Tekirdag","Tokat","Trabzon","Tunceli","Usak","Van","Yalova","Yozgat","Zonguldak"
    };
    return states;
}


else if (countryName == "Indonesia") {
    String[] states = {
        "Aceh","Bali","Banten","Bengkulu","Central Java","Central Kalimantan",
        "Central Sulawesi","East Java","East Kalimantan","East Nusa Tenggara",
        "Gorontalo","Jakarta","Jambi","Lampung","Maluku","North Kalimantan",
        "North Maluku","North Sulawesi","North Sumatra","Papua",
        "Riau","Riau Islands","Southeast Sulawesi","South Kalimantan",
        "South Sulawesi","South Sumatra","West Java","West Kalimantan",
        "West Nusa Tenggara","West Papua","West Sulawesi","West Sumatra",
        "Yogyakarta"
    };
    return states;
}

else if (countryName == "China") {
    String[] states = {
        "Anhui","Fujian","Gansu","Guangdong","Guizhou","Hainan","Hebei",
        "Heilongjiang","Henan","Hubei","Hunan","Jiangsu","Jiangxi","Jilin",
        "Liaoning","Qinghai","Shaanxi","Shandong","Shanxi","Sichuan","Yunnan",
        "Zhejiang",
        "Guangxi","Inner Mongolia","Ningxia","Tibet","Xinjiang",
        "Beijing","Shanghai","Tianjin","Chongqing",
        "Hong Kong","Macau"
    };
    return states;
}


else if (countryName == "Russia") {
    String[] states = {
        "Adygea","Altai Republic","Bashkortostan","Buryatia","Chechnya",
        "Chuvashia","Dagestan","Ingushetia","Kabardino-Balkaria","Kalmykia",
        "Karachay-Cherkessia","Karelia","Khakassia","Komi","Mari El","Mordovia",
        "North Ossetia-Alania","Sakha","Tatarstan","Tuva","Udmurtia",
        "Altai Krai","Kamchatka Krai","Khabarovsk Krai","Krasnodar Krai",
        "Krasnoyarsk Krai","Perm Krai","Primorsky Krai","Stavropol Krai",
        "Zabaykalsky Krai",
        "Amur","Arkhangelsk","Astrakhan","Belgorod","Bryansk","Chelyabinsk",
        "Irkutsk","Ivanovo","Kaliningrad","Kaluga","Kemerovo","Kirov",
        "Kostroma","Kurgan","Kursk","Leningrad","Lipetsk","Magadan",
        "Moscow Oblast","Murmansk","Nizhny Novgorod","Novgorod","Novosibirsk",
        "Omsk","Orenburg","Oryol","Penza","Pskov","Rostov","Ryazan",
        "Sakhalin","Samara","Saratov","Smolensk","Sverdlovsk","Tambov",
        "Tomsk","Tula","Tver","Tyumen","Ulyanovsk","Vladimir","Volgograd",
        "Vologda","Voronezh","Yaroslavl",
        "Moscow","Saint Petersburg","Sevastopol"
    };
    return states;
}



else if (countryName == "Pakistan") {
    String[] states = {
        "Punjab","Sindh","Balochistan","Khyber Pakhtunkhwa",
        "Gilgit-Baltistan","Azad Kashmir",
        "Islamabad Capital Territory"
    };
    return states;
}


else if (countryName == "Iran") {
    String[] states = {
        "Alborz","Ardabil","Bushehr","Chaharmahal and Bakhtiari",
        "East Azerbaijan","Fars","Gilan","Golestan","Hamadan","Hormozgan",
        "Ilam","Isfahan","Kerman","Kermanshah","Khuzestan","Kohgiluyeh and Boyer-Ahmad",
        "Kurdistan","Lorestan","Markazi","Mazandaran","North Khorasan",
        "Qazvin","Qom","Razavi Khorasan","Semnan","Sistan and Baluchestan",
        "South Khorasan","Tehran","West Azerbaijan","Yazd","Zanjan"
    };
    return states;
}

else if (countryName == "Iraq") {
    String[] states = {
        "Al Anbar","Babylon","Baghdad","Basra","Dhi Qar","Diyala",
        "Dohuk","Erbil","Karbala","Kirkuk","Maysan","Muthanna",
        "Najaf","Nineveh","Qadisiyyah","Saladin","Sulaymaniyah","Wasit"
    };
    return states;
}
else if (countryName == "Poland") {
    String[] states = {
        "Lower Silesian","Kuyavian-Pomeranian","Lublin","Lubusz",
        "Lodz","Lesser Poland","Masovian","Opole",
        "Subcarpathian","Podlaskie","Pomeranian","Silesian",
        "Swietokrzyskie","Warmian-Masurian",
        "Greater Poland","West Pomeranian"
    };
    return states;
}

else if (countryName == "Sweden") {
    String[] states = {
        "Blekinge","Dalarna","Gavleborg","Gotland","Halland",
        "Jamtland","Jonkoping","Kalmar","Kronoberg","Norrbotten",
        "Orebro","Ostergotland","Skane","Sodermanland",
        "Stockholm","Uppsala","Varmland","Vasterbotten",
        "Vasternorrland","Vastmanland","Vastra Gotaland"
    };
    return states;
}

else if (countryName == "Norway") {
    String[] states = {
        "Agder","Innlandet","More og Romsdal","Nordland",
        "Oslo","Rogaland","Troms og Finnmark",
        "Trondelag","Vestfold og Telemark",
        "Vestland","Viken"
    };
    return states;
}

else if (countryName == "Finland") {
    String[] states = {
        "Uusimaa","Southwest Finland","Satakunta","Tavastia Proper",
        "Pirkanmaa","Paijat-Hame","Kymenlaakso","South Karelia",
        "South Savo","North Savo","North Karelia","Central Finland",
        "South Ostrobothnia","Ostrobothnia","Central Ostrobothnia",
        "North Ostrobothnia","Kainuu","Lapland","Aland"
    };
    return states;
}

else if (countryName == "Netherlands") {
    String[] states = {
        "Drenthe","Flevoland","Friesland","Gelderland",
        "Groningen","Limburg","North Brabant",
        "North Holland","Overijssel","South Holland",
        "Utrecht","Zeeland"
    };
    return states;
}

else if (countryName == "Belgium") {
    String[] states = {
        "Antwerp","East Flanders","West Flanders","Flemish Brabant",
        "Limburg","Hainaut","Liege","Luxembourg",
        "Namur","Walloon Brabant"
    };
    return states;
}
else if (countryName == "Austria") {
    String[] states = {
        "Burgenland","Carinthia","Lower Austria",
        "Upper Austria","Salzburg","Styria",
        "Tyrol","Vorarlberg","Vienna"
    };
    return states;
}

else if (countryName == "Greece") {
    String[] states = {
        "Attica","Central Greece","Central Macedonia",
        "Crete","Eastern Macedonia and Thrace",
        "Epirus","Ionian Islands","North Aegean",
        "Peloponnese","South Aegean","Thessaly",
        "Western Greece","Western Macedonia"
    };
    return states;
}

else if (countryName == "Switzerland") {
    String[] states = {
        "Aargau","Appenzell Ausserrhoden","Appenzell Innerrhoden",
        "Basel-Landschaft","Basel-Stadt","Bern","Fribourg",
        "Geneva","Glarus","Graubunden","Jura","Lucerne",
        "Neuchatel","Nidwalden","Obwalden","Schaffhausen",
        "Schwyz","Solothurn","St. Gallen","Thurgau",
        "Ticino","Uri","Valais","Vaud","Zug","Zurich"
    };
    return states;
}
else if (countryName == "Denmark") {
    String[] states = {
        "Capital Region","Central Denmark",
        "North Denmark","Region Zealand",
        "Region of Southern Denmark"
    };
    return states;
}

else if (countryName == "Ireland") {
    String[] states = {
        "Carlow","Cavan","Clare","Cork","Donegal","Dublin",
        "Galway","Kerry","Kildare","Kilkenny","Laois",
        "Leitrim","Limerick","Longford","Louth","Mayo",
        "Meath","Monaghan","Offaly","Roscommon",
        "Sligo","Tipperary","Waterford","Westmeath",
        "Wexford","Wicklow"
    };
    return states;
}

else if (countryName == "Romania") {
    String[] states = {
        "Alba","Arad","Arges","Bacau","Bihor","Bistrita-Nasaud",
        "Botosani","Braila","Brasov","Bucharest","Buzau","Calarasi",
        "Caras-Severin","Cluj","Constanta","Covasna","Dambovita",
        "Dolj","Galati","Giurgiu","Gorj","Harghita","Hunedoara",
        "Ialomita","Iasi","Ilfov","Maramures","Mehedinti",
        "Mures","Neamt","Olt","Prahova","Salaj",
        "Satu Mare","Sibiu","Suceava","Teleorman",
        "Timis","Tulcea","Valcea","Vaslui","Vrancea"
    };
    return states;
}

else if (countryName == "Bulgaria") {
    String[] states = {
        "Blagoevgrad","Burgas","Dobrich","Gabrovo","Haskovo",
        "Kardzhali","Kyustendil","Lovech","Montana","Pazardzhik",
        "Pernik","Pleven","Plovdiv","Razgrad","Ruse",
        "Shumen","Silistra","Sliven","Smolyan","Sofia",
        "Sofia Province","Stara Zagora","Targovishte",
        "Varna","Veliko Tarnovo","Vidin","Vratsa","Yambol"
    };
    return states;
}

else if (countryName == "Serbia") {
    String[] states = {
        "Belgrade","Bor","Branicevo","Jablanica","Kolubara",
        "Macva","Morava","Nisava","Pcinja","Pirot",
        "Pomoravlje","Rasina","Raska","South Backa","South Banat",
        "Srem","Toplica","West Backa","Central Banat",
        "North Backa","North Banat","Zajecar","Zlatibor"
    };
    return states;
}

else if (countryName == "Serbia") {
    String[] states = {
        "Belgrade","Bor","Branicevo","Jablanica","Kolubara",
        "Macva","Morava","Nisava","Pcinja","Pirot",
        "Pomoravlje","Rasina","Raska","South Backa","South Banat",
        "Srem","Toplica","West Backa","Central Banat",
        "North Backa","North Banat","Zajecar","Zlatibor"
    };
    return states;
}

else if (countryName == "Croatia") {
    String[] states = {
        "Zagreb","Krapina-Zagorje","Sisak-Moslavina","Karlovac",
        "Varazdin","Koprivnica-Krizevci","Bjelovar-Bilogora",
        "Primorje-Gorski Kotar","Lika-Senj","Virovitica-Podravina",
        "Pozega-Slavonia","Brod-Posavina","Zadar","Osijek-Baranja",
        "Sibenik-Knin","Vukovar-Srijem","Split-Dalmatia",
        "Istria","Dubrovnik-Neretva","Medimurje"
    };
    return states;
}

else if (countryName == "Slovenia") {
    String[] states = {
        "Gorenjska","Goriska","Jugovzhodna Slovenija",
        "Koroska","Notranjsko-Kraska","Obalno-Kraska",
        "Osrednjeslovenska","Podravska","Pomurska",
        "Posavska","Primorsko-Notranjska","Savinjska"
    };
    return states;
}

else if (countryName == "Hungary") {
    String[] states = {
        "Bacs-Kiskun","Baranya","Bekes","Borsod-Abauj-Zemplen",
        "Csongrad-Csanad","Fejer","Gyor-Moson-Sopron","Hajdu-Bihar",
        "Heves","Jasz-Nagykun-Szolnok","Komarom-Esztergom",
        "Nograd","Pest","Somogy","Szabolcs-Szatmar-Bereg",
        "Tolna","Vas","Veszprem","Zala","Budapest"
    };
    return states;
}

else if (countryName == "Czech Republic") {
    String[] states = {
        "Prague","Central Bohemian","South Bohemian","Plzen",
        "Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove",
        "Pardubice","Vysocina","South Moravian","Olomouc",
        "Zlin","Moravian-Silesian"
    };
    return states;
}

else if (countryName == "Slovakia") {
    String[] states = {
        "Bratislava","Trnava","Trencin","Nitra",
        "Zilina","Banska Bystrica","Presov","Kosice"
    };
    return states;
}

else if (countryName == "Latvia") {
    String[] states = {
        "Riga","Daugavpils","Liepaja","Jelgava","Jurmala","Rezekne","Ventspils",
        "Adazi","Aizkraukle","Aluksne","Augšdaugava","Balvi","Bauska",
        "Cesis","Dobele","Gulbene","Jekabpils","Kekava","Kraslava",
        "Kuldiga","Limbazi","Ludza","Madona","Marupe","Ogre",
        "Olaine","Preili","Rezekne Municipality","Ropazi","Salaspils",
        "Saldus","Saulkrasti","Sigulda","Smiltene","South Kurzeme",
        "Talsi","Tukums","Valka","Valmiera","Varaklani","Ventspils Municipality"
    };
    return states;
}

else if (countryName == "Lithuania") {
    String[] states = {
        "Alytus","Kaunas","Klaipeda","Marijampole",
        "Panevezys","Siauliai","Taurage",
        "Telsiai","Utena","Vilnius"
    };
    return states;
}

else if (countryName == "Estonia") {
    String[] states = {
        "Harju","Hiiu","Ida-Viru","Jarva",
        "Jogeva","Laane","Laane-Viru","Parnu",
        "Polva","Rapla","Saare","Tartu",
        "Valga","Viljandi","Voru"
    };
    return states;
}


else if (countryName == "Belarus") {
    String[] states = {
        "Brest","Gomel","Grodno",
        "Minsk Region","Mogilev","Vitebsk","Minsk City"
    };
    return states;
}

else if (countryName == "Kazakhstan") {
    String[] states = {
        "Akmola","Aktobe","Almaty Region","Atyrau","East Kazakhstan",
        "Jambyl","Karaganda","Kostanay","Kyzylorda","Mangystau",
        "North Kazakhstan","Pavlodar","Turkistan","West Kazakhstan",
        "Ulytau","Abai","Zhetisu",
        "Almaty City","Astana City","Shymkent City"
    };
    return states;
}

else if (countryName == "Uzbekistan") {
    String[] states = {
        "Andijan","Bukhara","Fergana","Jizzakh",
        "Karakalpakstan","Khorezm","Namangan",
        "Navoiy","Qashqadaryo","Samarkand",
        "Sirdaryo","Surxondaryo","Tashkent Region","Tashkent City"
    };
    return states;
}

else if (countryName == "Turkmenistan") {
    String[] states = {
        "Ahal","Balkan","Dashoguz","Lebap","Mary","Ashgabat"
    };
    return states;
}

else if (countryName == "Kyrgyzstan") {
    String[] states = {
        "Batken","Chuy","Issyk-Kul",
        "Jalal-Abad","Naryn","Osh Region",
        "Talas","Bishkek City","Osh City"
    };
    return states;
}

else if (countryName == "Tajikistan") {
    String[] states = {
        "Sughd","Khatlon","Gorno-Badakhshan",
        "Districts of Republican Subordination","Dushanbe"
    };
    return states;
}

else if (countryName == "Armenia") {
    String[] states = {
        "Aragatsotn","Ararat","Armavir","Gegharkunik",
        "Kotayk","Lori","Shirak","Syunik",
        "Tavush","Vayots Dzor","Yerevan"
    };
    return states;
}

else if (countryName == "Azerbaijan") {
    String[] states = {
        "Absheron-Khizi","Ganja-Dashkasan","Gazakh-Tovuz",
        "Guba-Khachmaz","Karabakh","Lankaran-Astara",
        "Mil-Mughan","Nakhchivan","Shaki-Zagatala",
        "Shirvan-Salyan","Central Aran","East Zangezur"
    };
    return states;
}

else if (countryName == "Georgia") {
    String[] states = {
        "Adjara","Abkhazia","Guria","Imereti",
        "Kakheti","Kvemo Kartli","Mtskheta-Mtianeti",
        "Racha-Lechkhumi and Kvemo Svaneti",
        "Samegrelo-Zemo Svaneti","Samtskhe-Javakheti",
        "Shida Kartli","Tbilisi"
    };
    return states;
}

else if (countryName == "Jordan") {
    String[] states = {
        "Ajloun","Amman","Aqaba","Balqa",
        "Irbid","Jerash","Karak",
        "Ma'an","Madaba","Mafraq",
        "Tafilah","Zarqa"
    };
    return states;
}

else if (countryName == "Lebanon") {
    String[] states = {
        "Akkar","Baalbek-Hermel","Beirut",
        "Beqaa","Mount Lebanon","North",
        "Nabatieh","South"
    };
    return states;
}

else if (countryName == "Syria") {
    String[] states = {
        "Aleppo","Damascus","Daraa","Deir ez-Zor",
        "Hama","Hasakah","Homs","Idlib",
        "Latakia","Quneitra","Raqqa",
        "Rif Dimashq","As-Suwayda","Tartus"
    };
    return states;
}

else if (countryName == "Israel") {
    String[] states = {
        "Central","Haifa","Jerusalem",
        "Northern","Southern","Tel Aviv"
    };
    return states;
}

else if (countryName == "Cyprus") {
    String[] states = {
        "Famagusta","Kyrenia",
        "Larnaca","Limassol",
        "Nicosia","Paphos"
    };
    return states;
}

else if (countryName == "Nepal") {
    String[] states = {
        "Koshi","Madhesh","Bagmati",
        "Gandaki","Lumbini",
        "Karnali","Sudurpashchim"
    };
    return states;
}

else if (countryName == "Sri Lanka") {
    String[] states = {
        "Central","Eastern","North Central",
        "Northern","North Western",
        "Sabaragamuwa","Southern",
        "Uva","Western"
    };
    return states;
}

else if (countryName == "Thailand") {
    String[] states = {
        "Amnat Charoen","Ang Thong","Bangkok","Bueng Kan","Buriram",
        "Chachoengsao","Chai Nat","Chaiyaphum","Chanthaburi","Chiang Mai",
        "Chiang Rai","Chonburi","Chumphon","Kalasin","Kamphaeng Phet",
        "Kanchanaburi","Khon Kaen","Krabi","Lampang","Lamphun",
        "Loei","Lopburi","Mae Hong Son","Maha Sarakham","Mukdahan",
        "Nakhon Nayok","Nakhon Pathom","Nakhon Phanom","Nakhon Ratchasima",
        "Nakhon Sawan","Nakhon Si Thammarat","Nan","Narathiwat","Nong Bua Lamphu",
        "Nong Khai","Nonthaburi","Pathum Thani","Pattani","Phang Nga",
        "Phatthalung","Phayao","Phetchabun","Phetchaburi","Phichit",
        "Phitsanulok","Phra Nakhon Si Ayutthaya","Phrae","Phuket",
        "Prachinburi","Prachuap Khiri Khan","Ranong","Ratchaburi",
        "Rayong","Roi Et","Sa Kaeo","Sakon Nakhon","Samut Prakan",
        "Samut Sakhon","Samut Songkhram","Saraburi","Satun","Sing Buri",
        "Sisaket","Songkhla","Sukhothai","Suphan Buri","Surat Thani",
        "Surin","Tak","Trang","Trat","Ubon Ratchathani",
        "Udon Thani","Uthai Thani","Uttaradit","Yala","Yasothon"
    };
    return states;
}

else if (countryName == "Malaysia") {
    String[] states = {
        "Johor","Kedah","Kelantan","Malacca","Negeri Sembilan",
        "Pahang","Penang","Perak","Perlis","Sabah",
        "Sarawak","Selangor","Terengganu",
        "Kuala Lumpur","Labuan","Putrajaya"
    };
    return states;
}

else if (countryName == "Singapore") {
    String[] states = {
        "Central","East","North",
        "North-East","West"
    };
    return states;
}


else if (countryName == "Cambodia") {
    String[] states = {
        "Banteay Meanchey","Battambang","Kampong Cham","Kampong Chhnang",
        "Kampong Speu","Kampong Thom","Kampot","Kandal","Kep",
        "Koh Kong","Kratie","Mondulkiri","Oddar Meanchey",
        "Pailin","Phnom Penh","Preah Sihanouk","Preah Vihear",
        "Prey Veng","Pursat","Ratanakiri","Siem Reap",
        "Stung Treng","Svay Rieng","Takeo","Tboung Khmum"
    };
    return states;
}

else if (countryName == "Laos") {
    String[] states = {
        "Attapeu","Bokeo","Bolikhamsai","Champasak",
        "Houaphanh","Khammouane","Luang Namtha",
        "Luang Prabang","Oudomxay","Phongsaly",
        "Salavan","Savannakhet","Sekong",
        "Vientiane Province","Vientiane Capital",
        "Xaisomboun","Xayabury","Xieng Khouang"
    };
    return states;
}

else if (countryName == "Vietnam") {
    String[] states = {
        "An Giang","Ba Ria-Vung Tau","Bac Giang","Bac Kan","Bac Lieu","Bac Ninh",
        "Ben Tre","Binh Dinh","Binh Duong","Binh Phuoc","Binh Thuan",
        "Ca Mau","Cao Bang","Dak Lak","Dak Nong","Dien Bien","Dong Nai",
        "Dong Thap","Gia Lai","Ha Giang","Ha Nam","Ha Tinh","Hai Duong",
        "Hau Giang","Hoa Binh","Hung Yen","Khanh Hoa","Kien Giang","Kon Tum",
        "Lai Chau","Lam Dong","Lang Son","Lao Cai","Long An","Nam Dinh",
        "Nghe An","Ninh Binh","Ninh Thuan","Phu Tho","Quang Binh",
        "Quang Nam","Quang Ngai","Quang Ninh","Quang Tri","Soc Trang",
        "Son La","Tay Ninh","Thai Binh","Thai Nguyen","Thanh Hoa",
        "Thua Thien-Hue","Tien Giang","Tra Vinh","Tuyen Quang",
        "Vinh Long","Vinh Phuc","Yen Bai",
        "Hanoi","Ho Chi Minh City","Hai Phong","Da Nang","Can Tho"
    };
    return states;
}

else if (countryName == "Philippines") {
    String[] states = {
        "Ilocos","Cagayan Valley","Central Luzon","CALABARZON","MIMAROPA",
        "Bicol","Western Visayas","Central Visayas","Eastern Visayas",
        "Zamboanga Peninsula","Northern Mindanao","Davao Region",
        "SOCCSKSARGEN","Caraga","Bangsamoro",
        "National Capital Region","Cordillera","Negros Island Region"
    };
    return states;
}

else if (countryName == "Myanmar") {
    String[] states = {
        "Ayeyarwady","Bago","Magway","Mandalay","Sagaing","Tanintharyi","Yangon",
        "Chin","Kachin","Kayah","Kayin","Mon","Rakhine","Shan","Naypyidaw"
    };
    return states;
}


else if (countryName == "Bangladesh") {
    String[] states = {
        "Barisal","Chittagong","Dhaka","Khulna",
        "Mymensingh","Rajshahi","Rangpur","Sylhet"
    };
    return states;
}

else if (countryName == "Afghanistan") {
    String[] states = {
        "Badakhshan","Badghis","Baghlan","Balkh","Bamyan","Daykundi",
        "Farah","Faryab","Ghazni","Ghor","Helmand","Herat","Jowzjan",
        "Kabul","Kandahar","Kapisa","Khost","Kunar","Kunduz","Laghman",
        "Logar","Nangarhar","Nimruz","Nuristan","Paktia","Paktika",
        "Panjshir","Parwan","Samangan","Sar-e Pol","Takhar","Uruzgan",
        "Wardak","Zabul"
    };
    return states;
}

else if (countryName == "Afghanistan") {
    String[] states = {
        "Badakhshan","Badghis","Baghlan","Balkh","Bamyan","Daykundi",
        "Farah","Faryab","Ghazni","Ghor","Helmand","Herat","Jowzjan",
        "Kabul","Kandahar","Kapisa","Khost","Kunar","Kunduz","Laghman",
        "Logar","Nangarhar","Nimruz","Nuristan","Paktia","Paktika",
        "Panjshir","Parwan","Samangan","Sar-e Pol","Takhar","Uruzgan",
        "Wardak","Zabul"
    };
    return states;
}

else if (countryName == "Nigeria") {
    String[] states = {
        "Abia","Adamawa","Akwa Ibom","Anambra","Bauchi","Bayelsa",
        "Benue","Borno","Cross River","Delta","Ebonyi","Edo",
        "Ekiti","Enugu","Gombe","Imo","Jigawa","Kaduna","Kano",
        "Katsina","Kebbi","Kogi","Kwara","Lagos","Nasarawa",
        "Niger","Ogun","Ondo","Osun","Oyo","Plateau","Rivers",
        "Sokoto","Taraba","Yobe","Zamfara","FCT Abuja"
    };
    return states;
}

else if (countryName == "Kenya") {
    String[] states = {
        "Baringo","Bomet","Bungoma","Busia","Elgeyo-Marakwet","Embu",
        "Garissa","Homa Bay","Isiolo","Kajiado","Kakamega","Kericho",
        "Kiambu","Kilifi","Kirinyaga","Kisii","Kisumu","Kitui",
        "Kwale","Laikipia","Lamu","Machakos","Makueni","Mandera",
        "Marsabit","Meru","Migori","Mombasa","Muranga","Nairobi",
        "Nakuru","Nandi","Narok","Nyamira","Nyandarua","Nyeri",
        "Samburu","Siaya","Taita-Taveta","Tana River","Tharaka-Nithi",
        "Trans-Nzoia","Turkana","Uasin Gishu","Vihiga","Wajir","West Pokot"
    };
    return states;
}

else if (countryName == "Morocco") {
    String[] states = {
        "Beni Mellal-Khenifra","Casablanca-Settat",
        "Draa-Tafilalet","Fes-Meknes","Guelmim-Oued Noun",
        "Laayoune-Sakia El Hamra","Marrakesh-Safi",
        "Oriental","Rabat-Sale-Kenitra",
        "Souss-Massa","Tanger-Tetouan-Al Hoceima","Dakhla-Oued Ed-Dahab"
    };
    return states;
}

else if (countryName == "Algeria") {
    String[] states = {
        "Adrar","Ain Defla","Ain Temouchent","Algiers","Annaba",
        "Batna","Bechar","Bejaia","Biskra","Blida","Bordj Bou Arreridj",
        "Bouira","Boumerdes","Chlef","Constantine","Djelfa","El Bayadh",
        "El Oued","El Tarf","Ghardaia","Guelma","Illizi","Jijel",
        "Khenchela","Laghouat","Mascara","Medea","Mila","Mostaganem",
        "Msila","Naama","Oran","Ouargla","Oum El Bouaghi",
        "Relizane","Saida","Setif","Sidi Bel Abbes","Skikda",
        "Souk Ahras","Tamanrasset","Tebessa","Tiaret","Tindouf",
        "Tipaza","Tissemsilt","Tizi Ouzou","Tlemcen"
    };
    return states;
}

else if (countryName == "Ghana") {
    String[] states = {
        "Ahafo","Ashanti","Bono","Bono East","Central",
        "Eastern","Greater Accra","North East","Northern",
        "Oti","Savannah","Upper East","Upper West",
        "Volta","Western","Western North"
    };
    return states;
}

else if (countryName == "Ethiopia") {
    String[] states = {
        "Afar","Amhara","Benishangul-Gumuz","Central Ethiopia",
        "Gambela","Harari","Oromia","Sidama","Somali",
        "South Ethiopia","South West Ethiopia Peoples",
        "Tigray","Addis Ababa","Dire Dawa"
    };
    return states;
}

else if (countryName == "Tanzania") {
    String[] states = {
        "Arusha","Dar es Salaam","Dodoma","Geita","Iringa","Kagera",
        "Katavi","Kigoma","Kilimanjaro","Lindi","Manyara","Mara",
        "Mbeya","Morogoro","Mtwara","Mwanza","Njombe","Pemba North",
        "Pemba South","Pwani","Rukwa","Ruvuma","Shinyanga","Simiyu",
        "Singida","Songwe","Tabora","Tanga","Zanzibar Central/South",
        "Zanzibar North","Zanzibar Urban/West"
    };
    return states;
}

else if (countryName == "Uganda") {
    String[] states = {
        "Central","Eastern","Northern","Western"
    };
    return states;
}

else if (countryName == "Senegal") {
    String[] states = {
        "Dakar","Diourbel","Fatick","Kaffrine","Kaolack",
        "Kedougou","Kolda","Louga","Matam","Saint-Louis",
        "Sedhiou","Tambacounda","Thies","Ziguinchor"
    };
    return states;
}

else if (countryName == "Argentina") {
    String[] states = {
        "Buenos Aires","Catamarca","Chaco","Chubut","Cordoba","Corrientes",
        "Entre Rios","Formosa","Jujuy","La Pampa","La Rioja","Mendoza",
        "Misiones","Neuquen","Rio Negro","Salta","San Juan","San Luis",
        "Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego",
        "Tucuman","Buenos Aires City"
    };
    return states;
}

else if (countryName == "Chile") {
    String[] states = {
        "Arica y Parinacota","Tarapaca","Antofagasta","Atacama","Coquimbo",
        "Valparaiso","Metropolitan Santiago","O'Higgins","Maule",
        "Nuble","Biobio","Araucania","Los Rios","Los Lagos",
        "Aysen","Magallanes"
    };
    return states;
}

else if (countryName == "Peru") {
    String[] states = {
        "Amazonas","Ancash","Apurimac","Arequipa","Ayacucho","Cajamarca",
        "Callao","Cusco","Huancavelica","Huanuco","Ica","Junin","La Libertad",
        "Lambayeque","Lima","Loreto","Madre de Dios","Moquegua","Pasco",
        "Piura","Puno","San Martin","Tacna","Tumbes","Ucayali"
    };
    return states;
}

else if (countryName == "Colombia") {
    String[] states = {
        "Amazonas","Antioquia","Arauca","Atlantico","Bolivar","Boyaca",
        "Caldas","Caqueta","Casanare","Cauca","Cesar","Choco","Cordoba",
        "Cundinamarca","Guainia","Guaviare","Huila","La Guajira","Magdalena",
        "Meta","Narino","Norte de Santander","Putumayo","Quindio","Risaralda",
        "San Andres y Providencia","Santander","Sucre","Tolima","Valle del Cauca",
        "Vaupes","Vichada","Bogota Capital District"
    };
    return states;
}

else if (countryName == "Venezuela") {
    String[] states = {
        "Amazonas","Anzoategui","Apure","Aragua","Barinas","Bolivar",
        "Carabobo","Cojedes","Delta Amacuro","Falcon","Guarico","Lara",
        "Merida","Miranda","Monagas","Nueva Esparta","Portuguesa","Sucre",
        "Tachira","Trujillo","Yaracuy","Zulia","La Guaira","Capital District"
    };
    return states;
}

else if (countryName == "Cuba") {
    String[] states = {
        "Pinar del Rio","Artemisa","Havana","Mayabeque","Matanzas",
        "Cienfuegos","Villa Clara","Sancti Spiritus","Ciego de Avila",
        "Camaguey","Las Tunas","Holguin","Granma","Santiago de Cuba",
        "Guantanamo","Isla de la Juventud"
    };
    return states;
}

else if (countryName == "Dominican Republic") {
    String[] states = {
        "Azua","Bahoruco","Barahona","Dajabon","Distrito Nacional",
        "Duarte","El Seibo","Elias Pina","Espaillat","Hato Mayor",
        "Hermanas Mirabal","Independencia","La Altagracia","La Romana",
        "La Vega","Maria Trinidad Sanchez","Monsenor Nouel",
        "Monte Cristi","Monte Plata","Pedernales","Peravia",
        "Puerto Plata","Samana","San Cristobal","San Jose de Ocoa",
        "San Juan","San Pedro de Macoris","Sanchez Ramirez",
        "Santiago","Santiago Rodriguez","Santo Domingo","Valverde"
    };
    return states;
}

else if (countryName == "Guatemala") {
    String[] states = {
        "Alta Verapaz","Baja Verapaz","Chimaltenango","Chiquimula",
        "El Progreso","Escuintla","Guatemala","Huehuetenango","Izabal",
        "Jalapa","Jutiapa","Peten","Quetzaltenango","Quiche",
        "Retalhuleu","Sacatepequez","San Marcos","Santa Rosa",
        "Solola","Suchitepequez","Totonicapan","Zacapa"
    };
    return states;
}

else if (countryName == "Costa Rica") {
    String[] states = {
        "San Jose","Alajuela","Cartago",
        "Heredia","Guanacaste","Puntarenas","Limon"
    };
    return states;
}

else if (countryName == "Honduras") {
    String[] states = {
        "Atlantida","Choluteca","Colon","Comayagua","Copan",
        "Cortes","El Paraiso","Francisco Morazan","Gracias a Dios",
        "Intibuca","Islas de la Bahia","La Paz","Lempira","Ocotepeque",
        "Olancho","Santa Barbara","Valle","Yoro"
    };
    return states;
}


else if (countryName == "Nicaragua") {
    String[] states = {
        "Boaco","Carazo","Chinandega","Chontales","Esteli",
        "Granada","Jinotega","Leon","Madriz","Managua",
        "Masaya","Matagalpa","Nueva Segovia","Rio San Juan",
        "North Caribbean Coast","South Caribbean Coast"
    };
    return states;
}

else if (countryName == "El Salvador") {
    String[] states = {
        "Ahuachapan","Cabanas","Chalatenango","Cuscatlan",
        "La Libertad","La Paz","La Union","Morazan",
        "San Miguel","San Salvador","San Vicente",
        "Santa Ana","Sonsonate","Usulutan"
    };
    return states;
}


else if (countryName == "Jamaica") {
    String[] states = {
        "Clarendon","Hanover","Kingston","Manchester",
        "Portland","Saint Andrew","Saint Ann","Saint Catherine",
        "Saint Elizabeth","Saint James","Saint Mary","Saint Thomas",
        "Trelawny","Westmoreland"
    };
    return states;
}

else if (countryName == "Haiti") {
    String[] states = {
        "Artibonite","Centre","Grand'Anse","Nippes",
        "Nord","Nord-Est","Nord-Ouest",
        "Ouest","Sud","Sud-Est"
    };
    return states;
}

else if (countryName == "Saudi Arabia") {
    String[] states = {
        "Riyadh","Makkah","Madinah","Eastern Province",
        "Asir","Tabuk","Qassim","Hail",
        "Northern Borders","Jazan",
        "Najran","Al Bahah","Al Jouf"
    };
    return states;
}

else if (countryName == "United Arab Emirates") {
    String[] states = {
        "Abu Dhabi","Dubai","Sharjah",
        "Ajman","Fujairah",
        "Ras Al Khaimah","Umm Al Quwain"
    };
    return states;
}

else if (countryName == "Qatar") {
    String[] states = {
        "Al Daayen","Al Khor","Al Rayyan",
        "Al Wakrah","Al Shamal",
        "Doha","Umm Salal"
    };
    return states;
}

else if (countryName == "Kuwait") {
    String[] states = {
        "Al Ahmadi","Al Asimah","Al Farwaniyah",
        "Al Jahra","Hawalli","Mubarak Al-Kabeer"
    };
    return states;
}

else if (countryName == "Oman") {
    String[] states = {
        "Ad Dakhiliyah","Ad Dhahirah","Al Batinah North",
        "Al Batinah South","Al Buraimi",
        "Al Wusta","Ash Sharqiyah North",
        "Ash Sharqiyah South","Dhofar","Musandam","Muscat"
    };
    return states;
}

else if (countryName == "Yemen") {
    String[] states = {
        "Abyan","Aden","Al Bayda","Al Dhale'e","Al Hudaydah",
        "Al Jawf","Al Mahrah","Al Mahwit","Amanat Al Asimah",
        "Amran","Dhamar","Hadramaut","Hajjah","Ibb",
        "Lahij","Marib","Raymah","Saada","Sana'a",
        "Shabwah","Socotra","Taiz"
    };
    return states;
}

else if (countryName == "South Sudan") {
    String[] states = {
        "Central Equatoria","Eastern Equatoria","Western Equatoria",
        "Jonglei","Lakes","Northern Bahr el Ghazal",
        "Western Bahr el Ghazal","Unity","Upper Nile","Warrap"
    };
    return states;
}

else if (countryName == "Namibia") {
    String[] states = {
        "Erongo","Hardap","Karas","Kavango East","Kavango West",
        "Khomas","Kunene","Ohangwena","Omaheke","Omusati",
        "Oshana","Oshikoto","Otjozondjupa","Zambezi"
    };
    return states;
}

else if (countryName == "Botswana") {
    String[] states = {
        "Central","Chobe","Ghanzi","Kgalagadi",
        "Kgatleng","Kweneng","North East","North West",
        "South East","Southern"
    };
    return states;
}

else if (countryName == "Zambia") {
    String[] states = {
        "Central","Copperbelt","Eastern","Luapula",
        "Lusaka","Muchinga","Northern",
        "North-Western","Southern","Western"
    };
    return states;
}

else if (countryName == "Zimbabwe") {
    String[] states = {
        "Bulawayo","Harare","Manicaland","Mashonaland Central",
        "Mashonaland East","Mashonaland West",
        "Masvingo","Matabeleland North","Matabeleland South",
        "Midlands"
    };
    return states;
}

else if (countryName == "Mozambique") {
    String[] states = {
        "Cabo Delgado","Gaza","Inhambane","Manica",
        "Maputo Province","Nampula","Niassa",
        "Sofala","Tete","Zambezia","Maputo City"
    };
    return states;
}

else if (countryName == "Angola") {
    String[] states = {
        "Bengo","Benguela","Bie","Cabinda","Cuando Cubango",
        "Cuanza Norte","Cuanza Sul","Cunene","Huambo",
        "Huila","Luanda","Lunda Norte","Lunda Sul",
        "Malanje","Moxico","Namibe","Uige","Zaire"
    };
    return states;
}

else if (countryName == "Madagascar") {
    String[] states = {
        "Alaotra-Mangoro","Amoron'i Mania","Analamanga","Analanjirofo",
        "Androy","Anosy","Atsimo-Andrefana","Atsimo-Atsinanana",
        "Atsinanana","Betsiboka","Boeny","Bongolava",
        "Diana","Haute Matsiatra","Ihorombe","Itasy",
        "Melaky","Menabe","Sava","Sofia","Vakinankaratra",
        "Vatovavy","Fitovinany"
    };
    return states;
}


else if (countryName == "Paraguay") {
    String[] states = {
        "Alto Paraguay","Alto Parana","Amambay","Boqueron",
        "Caaguazu","Caazapa","Canindeyu","Central",
        "Concepcion","Cordillera","Guaira","Itapua",
        "Misiones","Neembucu","Paraguari","Presidente Hayes",
        "San Pedro","Asuncion"
    };
    return states;
}

else if (countryName == "Uruguay") {
    String[] states = {
        "Artigas","Canelones","Cerro Largo","Colonia","Durazno",
        "Flores","Florida","Lavalleja","Maldonado","Montevideo",
        "Paysandu","Rio Negro","Rivera","Rocha","Salto",
        "San Jose","Soriano","Tacuarembo","Treinta y Tres"
    };
    return states;
}


else if (countryName == "Bolivia") {
    String[] states = {
        "Beni","Chuquisaca","Cochabamba","La Paz",
        "Oruro","Pando","Potosi","Santa Cruz","Tarija"
    };
    return states;
}


else if (countryName == "Ecuador") {
    String[] states = {
        "Azuay","Bolivar","Canar","Carchi","Chimborazo",
        "Cotopaxi","El Oro","Esmeraldas","Galapagos",
        "Guayas","Imbabura","Loja","Los Rios","Manabi",
        "Morona Santiago","Napo","Orellana","Pastaza",
        "Pichincha","Santa Elena","Santo Domingo de los Tsachilas",
        "Sucumbios","Tungurahua","Zamora-Chinchipe"
    };
    return states;
}

else if (countryName == "Guyana") {
    String[] states = {
        "Barima-Waini","Cuyuni-Mazaruni","Demerara-Mahaica",
        "East Berbice-Corentyne","Essequibo Islands-West Demerara",
        "Mahaica-Berbice","Pomeroon-Supenaam",
        "Potaro-Siparuni","Upper Demerara-Berbice",
        "Upper Takutu-Upper Essequibo"
    };
    return states;
}

else if (countryName == "Suriname") {
    String[] states = {
        "Brokopondo","Commewijne","Coronie","Marowijne",
        "Nickerie","Para","Paramaribo","Saramacca",
        "Sipaliwini","Wanica"
    };
    return states;
}

else if (countryName == "Mongolia") {
    String[] states = {
        "Arkhangai","Bayan-Olgii","Bayankhongor","Bulgan",
        "Darkhan-Uul","Dornod","Dornogovi","Dundgovi",
        "Govi-Altai","Govisumber","Khentii","Khovd",
        "Khuvsgul","Orkhon","Ovorkhangai","Omnogovi",
        "Selenge","Sukhbaatar","Tov","Uvs","Zavkhan","Ulaanbaatar"
    };
    return states;
}



else if (countryName == "Papua New Guinea") {
    String[] states = {
        "Central","Chimbu","East New Britain","East Sepik",
        "Eastern Highlands","Enga","Gulf","Hela",
        "Jiwaka","Madang","Manus","Milne Bay",
        "Morobe","New Ireland","Oro","Southern Highlands",
        "West New Britain","West Sepik","Western","National Capital District"
    };
    return states;
}

else if (countryName == "South Korea") {
    String[] states = {
        "Seoul","Busan","Daegu","Incheon","Gwangju","Daejeon","Ulsan","Sejong",
        "Gyeonggi","Gangwon","North Chungcheong","South Chungcheong",
        "North Jeolla","South Jeolla",
        "North Gyeongsang","South Gyeongsang","Jeju"
    };
    return states;
}

else if (countryName == "North Korea") {
    String[] states = {
        "Chagang","North Hamgyong","South Hamgyong",
        "North Hwanghae","South Hwanghae","Kangwon",
        "North Pyongan","South Pyongan","Ryanggang",
        "Pyongyang","Rason","Nampo"
    };
    return states;
}


else if (countryName == "Taiwan") {
    String[] states = {
        "Changhua","Chiayi County","Hsinchu County","Hualien",
        "Miaoli","Nantou","Penghu","Pingtung",
        "Taichung","Tainan","Yilan","Yunlin",
        "Keelung","Hsinchu City","Chiayi City",
        "Taipei","New Taipei","Kaohsiung","Taoyuan"
    };
    return states;
}


else if (countryName == "Timor-Leste") {
    String[] states = {
        "Aileu","Ainaro","Baucau","Bobonaro","Cova Lima",
        "Dili","Ermera","Lautem","Liquica","Manatuto",
        "Manufahi","Viqueque","Atauro","Oecusse"
    };
    return states;
}


else if (countryName == "Maldives") {
    String[] states = {
        "Haa Alif","Haa Dhaalu","Shaviyani","Noonu","Raa","Baa","Lhaviyani",
        "Kaafu","Alif Alif","Alif Dhaalu","Vaavu","Meemu","Faafu",
        "Dhaalu","Thaa","Laamu","Gaafu Alif","Gaafu Dhaalu","Gnaviyani",
        "Seenu","Male City"
    };
    return states;
}

else if (countryName == "Bhutan") {
    String[] states = {
        "Bumthang","Chukha","Dagana","Gasa","Haa","Lhuntse",
        "Mongar","Paro","Pema Gatshel","Punakha","Samdrup Jongkhar",
        "Samtse","Sarpang","Thimphu","Trashigang","Trashiyangtse",
        "Trongsa","Tsirang","Wangdue Phodrang","Zhemgang"
    };
    return states;
}


else if (countryName == "Brunei") {
    String[] states = {
        "Brunei-Muara","Belait","Tutong","Temburong"
    };
    return states;
}


else if (countryName == "Mauritius") {
    String[] states = {
        "Black River","Flacq","Grand Port","Moka",
        "Pamplemousses","Plaines Wilhems","Port Louis",
        "Riviere du Rempart","Savanne","Rodrigues"
    };
    return states;
}


else if (countryName == "Seychelles") {
    String[] states = {
        "Anse aux Pins","Anse Boileau","Anse Etoile","Anse Royale",
        "Baie Lazare","Baie Sainte Anne","Beau Vallon","Bel Air",
        "Bel Ombre","Cascade","English River","Glacis",
        "Grand Anse Mahe","Grand Anse Praslin","La Digue",
        "La Riviere Anglaise","Les Mamelles","Mont Buxton",
        "Mont Fleuri","Plaisance","Pointe La Rue",
        "Port Glaud","Roche Caiman","Saint Louis","Takamaka"
    };
    return states;
}


else if (countryName == "Malawi") {
    String[] states = {
        "Northern","Central","Southern"
    };
    return states;
}

else if (countryName == "Lesotho") {
    String[] states = {
        "Berea","Butha-Buthe","Leribe","Mafeteng",
        "Maseru","Mohale's Hoek","Mokhotlong",
        "Qacha's Nek","Quthing","Thaba-Tseka"
    };
    return states;
}


else if (countryName == "Eswatini") {
    String[] states = {
        "Hhohho","Lubombo","Manzini","Shiselweni"
    };
    return states;
}


else if (countryName == "Rwanda") {
    String[] states = {
        "Eastern","Kigali","Northern","Southern","Western"
    };
    return states;
}

else if (countryName == "Burundi") {
    String[] states = {
        "Bubanza","Bujumbura Mairie","Bujumbura Rural","Bururi",
        "Cankuzo","Cibitoke","Gitega","Karuzi","Kayanza",
        "Kirundo","Makamba","Muramvya","Muyinga",
        "Mwaro","Ngozi","Rumonge","Rutana","Ruyigi"
    };
    return states;
}


else if (countryName == "Liberia") {
    String[] states = {
        "Bomi","Bong","Gbarpolu","Grand Bassa","Grand Cape Mount",
        "Grand Gedeh","Grand Kru","Lofa","Margibi",
        "Maryland","Montserrado","Nimba","River Cess",
        "River Gee","Sinoe"
    };
    return states;
}

else if (countryName == "Sierra Leone") {
    String[] states = {
        "Eastern","Northern","North Western",
        "Southern","Western Area"
    };
    return states;
}

else if (countryName == "Togo") {
    String[] states = {
        "Centrale","Kara","Maritime",
        "Plateaux","Savanes"
    };
    return states;
}

else if (countryName == "Benin") {
    String[] states = {
        "Alibori","Atakora","Atlantique","Borgou",
        "Collines","Donga","Kouffo","Littoral",
        "Mono","Oueme","Plateau","Zou"
    };
    return states;
}

else if (countryName == "Burkina Faso") {
    String[] states = {
        "Boucle du Mouhoun","Cascades","Centre",
        "Centre-Est","Centre-Nord","Centre-Ouest",
        "Centre-Sud","Est","Hauts-Bassins",
        "Nord","Plateau-Central","Sahel","Sud-Ouest"
    };
    return states;
}

else if (countryName == "Niger") {
    String[] states = {
        "Agadez","Diffa","Dosso",
        "Maradi","Tahoua","Tillaberi","Zinder"
    };
    return states;
}


else if (countryName == "Cameroon") {
    String[] states = {
        "Adamawa","Centre","East","Far North",
        "Littoral","North","Northwest","South",
        "Southwest","West"
    };
    return states;
}

else if (countryName == "Gabon") {
    String[] states = {
        "Estuaire","Haut-Ogooue","Moyen-Ogooue",
        "Ngounie","Nyanga","Ogooue-Ivindo",
        "Ogooue-Lolo","Ogooue-Maritime","Woleu-Ntem"
    };
    return states;
}

else if (countryName == "Equatorial Guinea") {
    String[] states = {
        "Annobon","Bioko Norte","Bioko Sur",
        "Centro Sur","Kie-Ntem","Litoral",
        "Wele-Nzas"
    };
    return states;
}

else if (countryName == "Central African Republic") {
    String[] states = {
        "Bamingui-Bangoran","Bangui","Basse-Kotto",
        "Haute-Kotto","Haut-Mbomou","Kemo",
        "Lobaye","Mambere-Kadei","Mbomou",
        "Nana-Grebizi","Nana-Mambere",
        "Ombella-Mpoko","Ouaka","Ouham",
        "Ouham-Pende","Sangha-Mbaere","Vakaga"
    };
    return states;
}

else if (countryName == "Chad") {
    String[] states = {
        "Batha","Chari-Baguirmi","Ennedi-Est",
        "Ennedi-Ouest","Guera","Hadjer-Lamis",
        "Kanem","Lac","Logone Occidental",
        "Logone Oriental","Mandoul","Mayo-Kebbi Est",
        "Mayo-Kebbi Ouest","Moyen-Chari",
        "Ouaddai","Salamat","Sila",
        "Tandjile","Tibesti","Wadi Fira","N'Djamena"
    };
    return states;
}

else if (countryName == "Republic of the Congo") {
    String[] states = {
        "Bouenza","Brazzaville","Cuvette",
        "Cuvette-Ouest","Kouilou","Lekoumou",
        "Likouala","Niari","Plateaux","Pool","Sangha"
    };
    return states;
}

else if (countryName == "Democratic Republic of the Congo") {
    String[] states = {
        "Bas-Uele","Equateur","Haut-Katanga","Haut-Lomami",
        "Haut-Uele","Ituri","Kasai","Kasai-Central",
        "Kasai-Oriental","Kinshasa","Kongo-Central",
        "Kwango","Kwilu","Lomami","Lualaba",
        "Mai-Ndombe","Maniema","Mongala",
        "Nord-Kivu","Nord-Ubangi","Sankuru",
        "Sud-Kivu","Sud-Ubangi","Tanganyika",
        "Tshopo","Tshuapa"
    };
    return states;
}

else if (countryName == "Somalia") {
    String[] states = {
        "Banadir","Galmudug","Hirshabelle",
        "Jubaland","Puntland","South West"
    };
    return states;
}

else if (countryName == "Djibouti") {
    String[] states = {
        "Ali Sabieh","Arta","Dikhil",
        "Djibouti","Obock","Tadjourah"
    };
    return states;
}

else if (countryName == "Eritrea") {
    String[] states = {
        "Anseba","Debub","Gash-Barka",
        "Maekel","Northern Red Sea","Southern Red Sea"
    };
    return states;
}

else if (countryName == "Mauritania") {
    String[] states = {
        "Adrar","Assaba","Brakna","Dakhlet Nouadhibou",
        "Gorgol","Guidimaka","Hodh Ech Chargui",
        "Hodh El Gharbi","Inchiri","Nouakchott-Nord",
        "Nouakchott-Ouest","Nouakchott-Sud",
        "Tagant","Tiris Zemmour","Trarza"
    };
    return states;
}

else if (countryName == "Mali") {
    String[] states = {
        "Bamako","Gao","Kayes","Kidal",
        "Koulikoro","Menaka","Mopti",
        "Segou","Sikasso","Taoudenit","Tombouctou"
    };
    return states;
}

else if (countryName == "Guinea") {
    String[] states = {
        "Boke","Conakry","Faranah",
        "Kankan","Kindia","Labe","Mamou","Nzerekore"
    };
    return states;
}

else if (countryName == "Guinea-Bissau") {
    String[] states = {
        "Bafata","Biombo","Bissau",
        "Bolama","Cacheu","Gabu","Oio","Quinara","Tombali"
    };
    return states;
}

else if (countryName == "Gambia") {
    String[] states = {
        "Banjul","Central River","Lower River",
        "North Bank","Upper River","West Coast"
    };
    return states;
}
else if (countryName == "Cape Verde") {
    String[] states = {
        "Boa Vista","Brava","Maio","Mosteiros","Paul",
        "Porto Novo","Praia","Ribeira Brava",
        "Ribeira Grande","Sal","Santa Catarina",
        "Santa Cruz","Sao Domingos","Sao Filipe",
        "Sao Miguel","Tarrafal"
    };
    return states;
}

else if (countryName == "Sao Tome and Principe") {
    String[] states = {
        "Agua Grande","Cantagalo","Caué",
        "Lemba","Lobata","Me-Zochi","Principe"
    };
    return states;
}

else if (countryName == "Albania") {
    String[] states = {
        "Berat","Diber","Durres","Elbasan",
        "Fier","Gjirokaster","Korce","Kukes",
        "Lezhe","Shkoder","Tirana","Vlore"
    };
    return states;
}

else if (countryName == "North Macedonia") {
    String[] states = {
        "Vardar","East","Southeast","Pelagonia",
        "Southwest","Polog","Northeast","Skopje"
    };
    return states;
}

else if (countryName == "Montenegro") {
    String[] states = {
        "Andrijevica","Bar","Berane","Bijelo Polje",
        "Budva","Cetinje","Danilovgrad","Herceg Novi",
        "Kolasin","Kotor","Mojkovac","Niksic",
        "Plav","Pljevlja","Pluzine","Podgorica",
        "Rozaje","Savnik","Tivat","Ulcinj","Zabljak"
    };
    return states;
}

else if (countryName == "Andorra") {
    String[] states = {
        "Andorra la Vella","Canillo","Encamp",
        "Escaldes-Engordany","La Massana",
        "Ordino","Sant Julia de Loria"
    };
    return states;
}


else if (countryName == "San Marino") {
    String[] states = {
        "Acquaviva","Borgo Maggiore","Chiesanuova",
        "Domagnano","Faetano","Fiorentino",
        "Montegiardino","San Marino","Serravalle"
    };
    return states;
}

else if (countryName == "Moldova") {
    String[] states = {
        "Anenii Noi","Balti","Basarabeasca","Bender",
        "Briceni","Cahul","Cantemir","Calarasi",
        "Causeni","Chisinau","Cimislia","Criuleni",
        "Donduseni","Drochia","Dubasari","Edinet",
        "Falesti","Floresti","Glodeni","Hincesti",
        "Ialoveni","Leova","Nisporeni","Ocnita",
        "Orhei","Rezina","Riscani","Singerei",
        "Soroca","Stefan Voda","Straseni",
        "Taraclia","Telenesti","Ungheni",
        "Gagauzia"
    };
    return states;
} 


else if (countryName == "Liechtenstein") {
    String[] states = {
        "Balzers","Eschen","Gamprin","Mauren",
        "Planken","Ruggell","Schaan","Schellenberg",
        "Triesen","Triesenberg","Vaduz"
    };
    return states;
} else if (countryName == "Iceland") {
    String[] states = {
        "Capital Region","Southern Peninsula","West",
        "Westfjords","Northwest","Northeast",
        "East","South"
    };
    return states;
}

else if (countryName == "Malta") {
    String[] states = {
        "Northern","Northern Harbour","Southern Harbour",
        "Southeastern","Western","Gozo"
    };
    return states;
}

else if (countryName == "Slovenia") {
    String[] states = {
        "Gorenjska","Goriska","Jugovzhodna Slovenija",
        "Koroska","Notranjsko-Kraska","Obalno-Kraska",
        "Osrednjeslovenska","Podravska","Pomurska",
        "Posavska","Primorsko-Notranjska","Savinjska"
    };
    return states;
}

else if (countryName == "Luxembourg") {
    String[] states = {
        "Diekirch","Grevenmacher","Luxembourg"
    };
    return states;
}

else if (countryName == "Monaco") {
    String[] states = {
        "Monte Carlo","La Condamine","Fontvieille",
        "Moneghetti","Larvotto","La Rousse",
        "Saint Michel","Jardin Exotique"
    };
    return states;
}

else if (countryName == "Palestine") {
    String[] states = {
        "Bethlehem","Deir al-Balah","Gaza","Hebron",
        "Jenin","Jericho","Jerusalem","Khan Yunis",
        "Nablus","Qalqilya","Rafah","Ramallah",
        "Salfit","Tubas","Tulkarm"
    };
    return states;
}

else if (countryName == "Comoros") {
    String[] states = {
        "Grande Comore","Anjouan","Moheli"
    };
    return states;
}

else if (countryName == "Bahrain") {
    String[] states = {
        "Capital","Muharraq","Northern","Southern"
    };
    return states;
}

else if (countryName == "Samoa") {
    String[] states = {
        "Aana","Aiga-i-le-Tai","Atua",
        "Fa'asaleleaga","Gaga'emauga","Gagaifomauga",
        "Palauli","Satupa'itea","Tuamasaga",
        "Va'a-o-Fonoti","Vaisigano"
    };
    return states;
}

else if (countryName == "Tonga") {
    String[] states = {
        "Tongatapu","Vava'u","Ha'apai",
        "Eua","Niuas"
    };
    return states;
}

else if (countryName == "Vanuatu") {
    String[] states = {
        "Malampa","Penama","Sanma",
        "Shefa","Tafea","Torba"
    };
    return states;
}


else if (countryName == "Kiribati") {
    String[] states = {
        "Gilbert Islands","Line Islands","Phoenix Islands"
    };
    return states;
}

else if (countryName == "Nauru") {
    String[] states = {
        "Aiwo","Anabar","Anetan","Anibare","Baiti","Boe",
        "Buada","Denigomodu","Ewa","Ijuw","Meneng",
        "Nibok","Uaboe","Yaren"
    };
    return states;
}

else if (countryName == "Tuvalu") {
    String[] states = {
        "Funafuti","Nanumanga","Nanumea",
        "Niutao","Nui","Nukufetau",
        "Nukulaelae","Vaitupu","Niulakita"
    };
    return states;
}

else if (countryName == "Solomon Islands") {
    String[] states = {
        "Central","Choiseul","Guadalcanal",
        "Honiara","Isabel","Makira-Ulawa",
        "Malaita","Rennell and Bellona",
        "Temotu","Western"
    };
    return states;
}

else if (countryName == "Micronesia") {
    String[] states = {
        "Chuuk","Kosrae","Pohnpei","Yap"
    };
    return states;
}

else if (countryName == "Palau") {
    String[] states = {
        "Aimeliik","Airai","Angaur","Hatohobei","Kayangel",
        "Koror","Melekeok","Ngaraard","Ngarchelong","Ngardmau",
        "Ngatpang","Ngchesar","Ngeremlengui","Ngiwal","Peleliu","Sonsorol"
    };
    return states;
}

else if (countryName == "Marshall Islands") {
    String[] states = {
        "Ailinglaplap","Ailuk","Arno","Aur","Bikini",
        "Ebon","Enewetak","Jabat","Jaluit","Kili",
        "Kwajalein","Lae","Lib","Likiep","Majuro",
        "Maloelap","Mejit","Mili","Namdrik","Namu",
        "Rongelap","Ujae","Utrik","Wotho","Wotje"
    };
    return states;
}

else if (countryName == "Fiji") {
    String[] states = {
        "Central","Eastern","Northern","Western","Rotuma"
    };
    return states;
}

else if (countryName == "New Zealand") {
    String[] states = {
        "Northland","Auckland","Waikato","Bay of Plenty",
        "Gisborne","Hawke's Bay","Taranaki","Manawatu-Whanganui",
        "Wellington","Tasman","Nelson","Marlborough",
        "West Coast","Canterbury","Otago","Southland"
    };
    return states;
}

else if (countryName == "Antigua and Barbuda") {
    String[] states = {
        "Saint George","Saint John","Saint Mary",
        "Saint Paul","Saint Peter","Saint Philip",
        "Barbuda","Redonda"
    };
    return states;
}

else if (countryName == "Barbados") {
    String[] states = {
        "Christ Church","Saint Andrew","Saint George","Saint James",
        "Saint John","Saint Joseph","Saint Lucy","Saint Michael",
        "Saint Peter","Saint Philip","Saint Thomas"
    };
    return states;
}

else if (countryName == "Belize") {
    String[] states = {
        "Belize","Cayo","Corozal",
        "Orange Walk","Stann Creek","Toledo"
    };
    return states;
}


else if (countryName == "Dominica") {
    String[] states = {
        "Saint Andrew","Saint David","Saint George",
        "Saint John","Saint Joseph","Saint Luke",
        "Saint Mark","Saint Patrick","Saint Paul","Saint Peter"
    };
    return states;
}


else if (countryName == "Grenada") {
    String[] states = {
        "Saint Andrew","Saint David","Saint George",
        "Saint John","Saint Mark","Saint Patrick","Carriacou and Petite Martinique"
    };
    return states;
}

else if (countryName == "Saint Lucia") {
    String[] states = {
        "Anse la Raye","Castries","Choiseul","Dennery",
        "Gros Islet","Laborie","Micoud","Soufriere","Vieux Fort"
    };
    return states;
}

else if (countryName == "Saint Vincent and the Grenadines") {
    String[] states = {
        "Charlotte","Grenadines","Saint Andrew",
        "Saint David","Saint George","Saint Patrick"
    };
    return states;
}

else if (countryName == "Saint Kitts and Nevis") {
    String[] states = {
        "Christ Church Nichola Town","Saint Anne Sandy Point",
        "Saint George Basseterre","Saint George Gingerland",
        "Saint James Windward","Saint John Capisterre",
        "Saint John Figtree","Saint Mary Cayon",
        "Saint Paul Capisterre","Saint Paul Charlestown",
        "Saint Peter Basseterre","Saint Thomas Lowland",
        "Saint Thomas Middle Island","Trinity Palmetto Point"
    };
    return states;
}


else if (countryName == "Bahamas") {
    String[] states = {
        "Acklins","Andros","Berry Islands","Bimini",
        "Cat Island","Crooked Island","Eleuthera",
        "Exuma","Freeport","Fresh Creek",
        "Governor's Harbour","Green Turtle Cay",
        "Harbour Island","High Rock","Inagua",
        "Kemps Bay","Long Island","Marsh Harbour",
        "Mayaguana","New Providence","Nichollstown and Berry Islands",
        "Ragged Island","Rock Sound","San Salvador"
    };
    return states;
}


else if (countryName == "Lithuania") {
    String[] states = {
        "Alytus","Kaunas","Klaipeda","Marijampole",
        "Panevezys","Siauliai","Taurage","Telsiai",
        "Utena","Vilnius"
    };
    return states;
}


else if (countryName == "Latvia") {
    String[] states = {
        "Kurzeme","Latgale","Vidzeme","Zemgale"
    };
    return states;
}

else if (countryName == "Estonia") {
    String[] states = {
        "Harju","Hiiu","Ida-Viru","Jogeva","Jarva",
        "Laane","Laane-Viru","Parnu","Polva",
        "Rapla","Saare","Tartu","Valga","Viljandi","Voru"
    };
    return states;
}

else if (countryName == "Slovakia") {
    String[] states = {
        "Bratislava","Trnava","Trencin","Nitra",
        "Zilina","Banska Bystrica","Presov","Kosice"
    };
    return states;
}
   else {
            String[] states = {"No States Available"};
            return states;
        }
	}  

   public static void displayStates(String[] states) {
        for (String s : states) {
            System.out.println(s);
        }
        System.out.println("----------------------");
    }

}

