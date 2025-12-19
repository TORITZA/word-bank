# scrap CSV file containing words, their Parts of Speech, and various definitions, constructed from 
# a personal discord channel 
import pandas as pd


def csv_scraper(filename: str) -> list:
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
                 
                 
if __name__ == '__main__':
    print(csv_scraper('new-wordSample.csv'))