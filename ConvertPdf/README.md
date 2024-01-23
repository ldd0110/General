JODConverter automates document conversions using LibreOffice/OpenOffice.org

github.com/Alfresco/alfresco-jodconverter

solution convert from docx, xlsx,html to pdf using gotenberg
docker run --rm -p 3000:3000 thecodingmachine/gotenberg:6
curl --request POST \
--url http://localhost:3000/convert/office \
--header 'Content-Type: multipart/form-data' \
--form files=@document.docx \
--form files=@document2.docx \
-o result.pdf

github.com/gotenberg/gotenberg