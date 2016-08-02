String base = 'https://maps.googleapis.com/maps/api/geocode/xml?'
def address = ['ibn battuta gate hotel','dubai','uae']
def encoded = address.collect {URLEncoder.encode(it, 'UTF-8')} // spaces to +
encoded = encoded.join(',') //List to String
//def qs = "address=$encoded" //concatinating string
//println qs
//"$base$qs".toURL().text
("$base"+"address=$encoded").toURL().text // Fuck'em all!!!
def root = new XmlSlurper().parse(("$base"+"address=$encoded"))
def loc = root.result[0].geometry.location
println "(${loc.lat},${loc.lng})"

