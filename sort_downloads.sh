#! /usr/bin/bash

fileThreshold=10
logFile="/home/carson/download_sorter_log.txt"
noBuenoDir="/home/carson/files/no-bueno/"
downloadsDir="/home/carson/Downloads"

sortDownloads() {
	find "$downloadsDir" -maxdepth 1 -type f | while read -r file; do
		baseFile=$(basename "$file")
		path=$(echo "$baseFile" | java BuildPath)

		if [[ "$path" != "no bueno" ]]; then 
			mv "$file" "$path"
			echo "$(date) | $baseFile --> $path" >> "$logFile"
		else
			mv "$file" "$noBuenoDir"
			echo "$(date) | $baseFile es no bueno. :(" >> "$logFile"
		fi
	done
}

while true; do
	result=$(find "$downloadsDir" -maxdepth 1 -type f | wc -l)

	if [[ $result -gt $fileThreshold ]]; then 
		sortDownloads
	else
		echo "nothing | $(date)"
	fi

	sleep 10
done
