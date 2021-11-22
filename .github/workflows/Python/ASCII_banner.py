# subprocess.checall will install a pip Figlet library 
# to uninstsall the library open cmd and type pip uninstall pyfiglet
import sys
import subprocess

# implement pip as a subprocess:
subprocess.check_call([sys.executable, '-m', 'pip', 'install', 
'pyfiglet'])

from pyfiglet import Figlet
print("\n")
def render(text):
    f = Figlet()
    print('\n' * 10)
    a = f.renderText(text)
    print(a)


render('Edit this text')


subprocess.check_call([sys.executable, '-m', 'pip', 'uninstall', 
'pyfiglet',])