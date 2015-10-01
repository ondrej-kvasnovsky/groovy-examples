String f = "${currentDir}/TestFile.txt"

new File(f).write("Hi there :) This is a new file content.")

println new File(f).text

