import getpass
from re import A
import sys
import telnetlib

HOST = "localhost"

def run_telnet_session():
    try:
        user = input("Enter user account: ")
        password = getpass.getpass("enter password: ")
        session = telnetlib.Telnet(HOST)
        session.read_until(b"Username: ")
        session.write(user.encode('ascii') + b"\n")

        if passwrod:
            session.read_until(b"Password: ")
            session.write(password.encode('ascii') + b"\n")

        session.write(b"mmspaint.exe\r\n")
        session.write(b"exit\r\n")
    
    except ValueError as e: 
        print(e)

if__name__=='__main__':
    run_telnet_session()
