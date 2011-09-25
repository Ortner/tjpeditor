
This project aims to build a TaskJuggler editor.

TaskJuggler III: http://www.taskjuggler.org/tj3/manual/index.html

The editor is based on Eclipse (http://www.eclipse.org) technogies.

Language parser and editor is based on Xtext: http://www.eclipse.org/Xtext/

project status: alpha.
to acheive beta:
1) demonstrate context sensitive help
2) significantly more unit test coverage
3) resolve references
4) support of 'macro' and 'extend' keywords
5) post a video demo

TaskJuggler III grammar is in the file:
org.jjflyboy.tjpeditor/src/org/jjflyboy/tjpeditor/Project.xtext


Currently, building this plugin can be done only with eclipse IDE.
Build requirements:
 http://www.eclipse.org (plugin development environment required)
 http://www.eclipse.org/Xtext/
 http://code.google.com/a/eclipselabs.org/p/xtext-utils/wiki/Unit_Testing

TODO: supply build instructions targetted to developers uninitiated in eclipse plugin development.



related work:

1) stand alone editor, with installer, for any platform.  Eclipse
platform supports stand alone application development.  This
editor plugin would be so packaged.  Post to eclipse Marketplace.

2) integration to mylyn (http://www.eclipse.org/mylyn/).  
Mylyn creates a task oriented IDE from eclipse.  Perhaps a
TaskJuggler file could be a mylyn task repository.

3) TaskJuggler report generator launch configuration.  TaskJuggler III
is released under GPL which is not compatible with Eclipse Public License
and won't be distributable with this editor plugin.  However, eclipse
supports a configuration to launch an external tool.  Note: TaskJuggler III
is implemented as a ruby program, and might be suppported by jruby, in case
it is desirable to launch within the same jvm as the editor.


