from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
def main():
    return "Hello world_this is my first flask"


if __name__=="__main__":
    app.run()