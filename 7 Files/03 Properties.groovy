String f = "${currentDir}/test.properties"

Properties props = new Properties()
File propsFile = new File(f)
props.load(propsFile.newDataInputStream())

props.setProperty('popcorn', 'is ready')
props.store(propsFile.newWriter(), null)

println new File(f).text