# HardwareIdentifier
 Java Program to generate a Hardware ID to Lock Software to Hardware, by taking Operating system Details and generating a Hash.
 
 # YEAH, DON'T USE THIS. IT IS NOT GOOD AT ALL
 
 ## Instructions
 
 #### Download
 
 Download from the [Releases](https://github.com/ToxicAven/HardwareIdentifier/releases)!
 
 #### To Build
 
 Run `$ gradlew shadowJar` (Running `$ gradlew build` also works, however, it generates 2 Jars. use the jar titled with `Release`)
 
 #### To Run
 
3. Run `$ java -jar hwid-1.0-release.jar` to generate hwid.txt

## Q&A

### Why would I need this?

> Hardware IDs can be used in Private software as a sort of Copy Protection / Anti-Leak, as Only specific whitelisted Hardware setups can access a HWID Locked Program. By checking Hardware IDs on Execution of a program, against an Internal list, or a Pastebin / Github Raw, A Piece of software can be locked to hardware specifications.

## How secure is this HWID Generator?

> This Generator uses Operating System Version, Operating System Arch, User Language, File Structure, and Prosessor Information, and then generates a SHA-512 Hash Based on those factors. The Chance of somebody Else having the Same HWID Is Almost Perfect Zero.

## How Would I add this to my Java Program?

> Eventually I may make this a Gradle Package for easy use in programs, but as of now there is no Official way to add this to your program. I Reccommend using the gist Found [here](https://gist.github.com/ToxicAven/99bfbde4e7eb1324da485fec1f69a51b).
