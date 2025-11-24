@echo off
echo ========================================
echo CLEANING BUILD CACHE
echo ========================================
echo.

echo [1/4] Cleaning project...
call gradlew.bat clean
if %errorlevel% neq 0 (
    echo ERROR: Clean failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [2/4] Clean completed successfully!
echo.
echo [3/4] Building project...
call gradlew.bat build
if %errorlevel% neq 0 (
    echo ERROR: Build failed!
    pause
    exit /b %errorlevel%
)

echo.
echo [4/4] Build completed successfully!
echo.
echo ========================================
echo SUCCESS! Project is ready.
echo ========================================
echo.
echo You can now run the app or install with:
echo   gradlew.bat installDebug
echo.
pause
