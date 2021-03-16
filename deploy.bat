@ECHO OFF

SET WD=%CD%
SET SD=%~dp0
SET PARAMS=%*

cd "%SD%"

call gradlew clean publish %PARAMS%

cd "%WD%"

PAUSE
