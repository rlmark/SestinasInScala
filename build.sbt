name := "SestinasInScala"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  Dependencies.Scalactic,
  Dependencies.Scalatest % "test"
)

scalacOptions ++= Seq(
  "-deprecation",                      
  "-encoding", "utf-8",                
  "-explaintypes",                     
  "-language:existentials",            
  "-language:experimental.macros",     
  "-language:higherKinds",             
  "-language:implicitConversions",     
  "-unchecked",                        
  "-Ypartial-unification", 
  "-Ywarn-numeric-widen"          
)
scalacOptions in (Compile, console) --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings")