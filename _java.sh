#!/bin/sh
_java() {
  if [[ -n %1 ]]
    then
      # javac is used for compile the faile and java for executing of file
      javac $1 && java $1 
    else
      echo ":: How to use: _java <filename.java>";
      echo "If there is no any errors on java-file, it will be compile and then executing of java-file";
    fi
}
