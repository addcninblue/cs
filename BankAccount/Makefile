MAINFILE = PersonalBanking

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
	javac -d . -classpath . JUnitImposter.java
	java JUnitImposter
