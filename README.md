# json_reader_kabaev

Simple Scala/Spark applicaton for learning Spark purposes. Reads JSON file and parse it to Scala case classes.

## Running

spark-submit --master local[*] --class org.awk.JsonReader json_reader_kabaev-assembly-0.0.1.jar {path/to}/winemag-data-130k-v2.json

## Sample output

Wine(0,Italy,87,None,Nicosia 2013 Vulkв”њР° Bianco  (Etna),White Blend,Nicosia)
Wine(1,Portugal,87,Some(15.0),Quinta dos Avidagos 2011 Avidagos Red (Douro),Portuguese Red,Quinta dos Avidagos)
Wine(2,US,87,Some(14.0),Rainstorm 2013 Pinot Gris (Willamette Valley),Pinot Gris,Rainstorm)
Wine(3,US,87,Some(13.0),St. Julian 2013 Reserve Late Harvest Riesling (Lake Michigan Shore),Riesling,St. Julian)
Wine(4,US,87,Some(65.0),Sweet Cheeks 2012 Vintner's Reserve Wild Child Block Pinot Noir (Willamette Valley),Pinot Noir,Sweet Cheeks)
Wine(5,Spain,87,Some(15.0),Tandem 2011 Ars In Vitro Tempranillo-Merlot (Navarra),Tempranillo-Merlot,Tandem)
Wine(6,Italy,87,Some(16.0),Terre di Giurfo 2013 Belsito Frappato (Vittoria),Frappato,Terre di Giurfo)
Wine(7,France,87,Some(24.0),Trimbach 2012 Gewurztraminer (Alsace),Gewв”њв•ќrztraminer,Trimbach)
Wine(8,Germany,87,Some(12.0),Heinz Eifel 2013 Shine Gewв”њв•ќrztraminer (Rheinhessen),Gewв”њв•ќrztraminer,Heinz Eifel)
Wine(9,France,87,Some(27.0),Jean-Baptiste Adam 2012 Les Natures Pinot Gris (Alsace),Pinot Gris,Jean-Baptiste Adam)
Wine(10,US,87,Some(19.0),Kirkland Signature 2011 Mountain Cuvв”њР№e Cabernet Sauvignon (Napa Valley),Cabernet Sauvignon,Kirkland Signature)

