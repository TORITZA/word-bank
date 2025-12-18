# scrap CSV file containing words, their Parts of Speech, and various definitions, constructed from 
# a personal discord channel 
import csv

def csv_scraper(filename: str):
    with open(filename) as f:
        content = csv.reader(f)
        next(content)
        for _, _, _, text, _, _ in content:
            pass




if __name__ == '__main__':
    csv_scraper() 