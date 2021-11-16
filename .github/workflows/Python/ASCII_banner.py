# subprocess.checall will install a pip Figlet library 
# to uninstsall the library open cmd and type pip uninstall pyfiglet
import sys
import subprocess

# implement pip as a subprocess:
subprocess.check_call([sys.executable, '-m', 'pip', 'install', 
'pyfiglet'])

from pyfiglet import Figlet
print("\n")
name = input("Enter your name: ")

def render(text, name):
    f = Figlet()
    print('\n' * 10)
    print(f.renderText(text))
    print(f.renderText(name))

render('Hello', name)