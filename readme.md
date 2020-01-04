Runtastic Converter
Converts Runtastic full export to TCX files.

Usage:

    java -jar runtasticConverter.js -f <sportSessionJsonFile>
    java -jar runtasticConverter.js -d <sportSessionDirectory>
    

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
