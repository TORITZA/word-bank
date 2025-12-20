# scrap CSV file containing words, their Parts of Speech, and various definitions, constructed from 
# a personal discord channel 
import pandas as pd
from markdown_text_clean import clean_text


def csv_scraper(filename: str) -> list:
    '''
    Scraps word, POS, and definitions data from personal, pre-exising Discord 
    chat logs
    
    :param filename: name of the .csv file
    :return: a list of all the words (+ their POS & definitions), stripped of preceding 
    emoticon markdown & white space 
    '''
    strip = []
    data = pd.read_csv(filename, skipfooter=1, skip_blank_lines=True, engine='python')
    for i, row in data.iterrows():
        if row['Content'][0:2] == ':X':
            strip.append(row['Content'][14:].strip())
        elif row['Content'][0:2] == ':h':
            strip.append(row['Content'][17:].strip())
        else:
            strip.append(row['Content'].strip())
    return strip
                 
def dict_compiler(words: list) -> dict:
    compiled = {}
    for item in words:
        if '-' in item.split():
            item.split().pop()
        compiled[clean_text(item.split()[0])] = (clean_text(item.split()[1]), clean_text(' '.join((item.split()[2:]))))
    
    for key in compiled:
        print(f'{key}: {compiled[key]}\n')
                 

if __name__ == '__main__':
    dict_compiler(csv_scraper('new-wordSample.csv'))