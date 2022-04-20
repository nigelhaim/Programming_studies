import feedparser
import webbrowser

feed = feedparser.parse("https://finance.yahoo.com.rss/")
feed_entries = feed.entries

for entry in feed.entries:
    article_title = entry.title
    article_link = entry.link
    article_published_at = entry.published
    article_published_at_parsed = entry.published_parsed

print("{}".format(article_title))