#!/bin/bash
# rename.sh
for fileV in `ls *.mp4`
do
	idx=`expr ${#fileV} - 4`
	mv $fileV ${fileV:0:$idx}.mp3
done
