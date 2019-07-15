echo "READ readme.txt before running the project"

@cd /d "%~dp0"
cd "WirelessPresenter\bin"
%D:~0,2%
java WirelessServer
pause