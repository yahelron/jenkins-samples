import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

ffdriver = webdriver.Firefox(firefox_binary="C:\\Program Files\\Mozilla Firefox\\firefox.exe",  executable_path='geckodriver.exe')
ffdriver.get("https://translate.google.co.il/?hl=iw#view=home&op=translate&sl=iw&tl=en")
ffdriver.find_element_by_id("source").send_keys("איך קוראים לך")
ffdriver.quit()

# 5
# Open Youtube web page
# Type a name of a song
# Click on search.
ffdriver = webdriver.Firefox(firefox_binary="C:\\Program Files\\Mozilla Firefox\\firefox.exe",  executable_path='geckodriver.exe')
ffdriver.get("https://www.youtube.com/")
ffdriver.find_element_by_name("search_query").send_keys("Leonard cohen everybody knows")
ffdriver.find_element_by_id("search-icon-legacy").click()
ffdriver.find_element_by_id("video-title").click()
ffdriver.quit()
