MAINFILE = ChildLaborInc

sourcefiles = $(MAINFILE).java

classfiles = $(sourcefiles:.java=.class)

all : $(classfiles)

%.class : %.java
	javac -d . -classpath . $<

clean:
	rm -f *.class

run:
	java $(MAINFILE)

test:
	javac JUnitImposter.java
	java JUnitImposter
