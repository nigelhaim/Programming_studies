import feedparser
import webbrowser

feed = feedparser.parse("https://financee.yahoo.com/rss/")
feed_entries = feed.entries

for entry in feed_entries:
    article_title = entry.title
    article_link = entry.link

    print("{}".format(article_title))
    print("{}".format(article_link))
    print()