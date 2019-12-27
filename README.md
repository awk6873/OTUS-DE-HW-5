# json_reader_kabaev

Simple Scala/Spark applicaton for learning Spark purposes. Reads JSON file and parse it to Scala case classes.

## Running

spark-submit --master local[*] --class org.awk.JsonReader json_reader_kabaev-assembly-0.0.1.jar {path/to}/winemag-data-130k-v2.json

## Sample output

Wine(0,Italy,87,Nicosia 2013 Vulkà Bianco  (Etna),White Blend,Nicosia)
Wine(1,Portugal,87,Quinta dos Avidagos 2011 Avidagos Red (Douro),Portuguese Red,Quinta dos Avidagos)
Wine(2,US,87,Rainstorm 2013 Pinot Gris (Willamette Valley),Pinot Gris,Rainstorm)
Wine(3,US,87,St. Julian 2013 Reserve Late Harvest Riesling (Lake Michigan Shore),Riesling,St. Julian)
Wine(4,US,87,Sweet Cheeks 2012 Vintner's Reserve Wild Child Block Pinot Noir (Willamette Valley),Pinot Noir,Sweet Cheeks)
Wine(5,Spain,87,Tandem 2011 Ars In Vitro Tempranillo-Merlot (Navarra),Tempranillo-Merlot,Tandem)
Wine(6,Italy,87,Terre di Giurfo 2013 Belsito Frappato (Vittoria),Frappato,Terre di Giurfo)
Wine(7,France,87,Trimbach 2012 Gewurztraminer (Alsace),Gewürztraminer,Trimbach)
Wine(8,Germany,87,Heinz Eifel 2013 Shine Gewürztraminer (Rheinhessen),Gewürztraminer,Heinz Eifel)
Wine(9,France,87,Jean-Baptiste Adam 2012 Les Natures Pinot Gris (Alsace),Pinot Gris,Jean-Baptiste Adam)
Wine(10,US,87,Kirkland Signature 2011 Mountain Cuvée Cabernet Sauvignon (Napa Valley),Cabernet Sauvignon,Kirkland Signature)

