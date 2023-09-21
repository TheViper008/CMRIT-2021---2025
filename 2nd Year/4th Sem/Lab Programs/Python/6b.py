import os
from zipfile import ZipFile

folder = input("Enter folder name to be zipped:")

# Check if the specified folder exists
if not os.path.exists(folder):
    print(f"The folder '{folder}' does not exist.")
else:
    myfile = folder + ".zip"

    # Check if the ZIP file already exists
    if os.path.exists(myfile):
        print(f"The ZIP file '{myfile}' already exists.")
    else:
        with ZipFile(myfile, "w") as Zip_object:
            for folder_name, sub_folders, file_names in os.walk(folder):
                for filename in file_names:
                    filepath = os.path.join(folder_name, filename)
                    Zip_object.write(filepath, os.path.basename(filepath))

        print(f"{myfile} ZIP file created.")
