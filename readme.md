# Runtastic Converter
Converts Runtastic full export to TCX or GPX files. Export can be triggered on the Runtastic Webpage after login at the profile settings page.

TCX is GARMIN specific and contains more meta information, like total distance, calories, etc. 
GPX is more general purpose and basically just contains waypoints coordinates.

Usage:

    java -jar runtasticConverter.jar [gpx|tcx] <sportSessionJsonFile>|<sportSessionDirectory> <outputDirectory>
    

The Runtastic full export can be generated once per week on the settings page in the Web UI.
It is provided as a ZIP file which contains all data and needs to be extracted. The folder structure looks like this:

    /Routes
    /Photos
    /User
    /Sport-sessions
      0d4b90a9-4253-4740-be4a-f9000bc6eb81.json
      00be670b-8965-4e2b-8183-e76187ec01d4.json
      [...]
      /GPS-data
        0d4b90a9-4253-4740-be4a-f9000bc6eb81.json
        00be670b-8965-4e2b-8183-e76187ec01d4.json
        [...]

This program processes the json files inside of the Sport-sessions folder and correlates them with the data in GPS-data.

## Development
### Build
    mvn
    

### Schema files
JAXB POJOs for TCX and GPX export formats have been generated with Java Tooling, see xjc.
Jackson POJOs for Runtastic JSON files have been generate like this:
+ Derive JSON Schema from JSON files: https://www.jsonschema.net/
+ Generate POJOs from JSON Schema: http://www.jsonschema2pojo.org/