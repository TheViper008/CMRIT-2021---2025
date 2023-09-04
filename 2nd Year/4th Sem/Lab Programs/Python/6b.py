import os
from zipfile import ZipFile 

folder = input("Enter folder name to be zipped:")
myfile = folder+".zip"
with ZipFile(myfile,"w") as Zip_object:
    for folder_name,sub_folders,file_names in os.walk(folder):
        for filename in file_names:
            filepath = os.path.join(folder_name,filename)
            Zip_object.write(filepath,os.path.basename(filepath))
    if os.path.exists(myfile):
        print(f"{myfile} zipfile created")
    else:
        print("Not Found")
