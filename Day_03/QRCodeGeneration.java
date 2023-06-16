package Day_03;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGeneration {

	public static void main(String[] args) throws WriterException, IOException {
		String name = "akshay shahane";
		String designation = "Software Engineer";
		String companyName = "i-exceed";
		int height=450;
		int width=450;
		QRCodeWriter codeWriter = new QRCodeWriter();
		BitMatrix encode = codeWriter.encode(name+designation+companyName,BarcodeFormat.QR_CODE,height,width);
		Path path = Paths.get("./src/main/resources/QRCode.png");
		MatrixToImageWriter.writeToPath(encode, "PNG", path);
		
	}
}
