package com.example.photoapp;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DataPhoto {
   public static ArrayList<PhoTo> phoTos = new ArrayList<>();
    public static ArrayList<PhoTo>GetData(){
        phoTos.add(new PhoTo(1,"https://newfreshfoods.com.vn/datafiles/3/2018-02-27/16100958642348_tao-do-my-red-delicious-size-36-44.jpg","Táo","Quả táo có chứa rất nhiều dưỡng chất có lợi cho sức khỏe của bạn chẳng hạn như Carb, chất xơ, đường, chất béo, vitamin C, kali, magie,… Tuy cung cấp nhiều dinh dưỡng nhưng một quả táo chỉ có chứa 52 calo.\n" +
                "\n" +
                "Bên cạnh đó, một lý do khiến nhiều người lựa chọn loại quả này đó là thơm ngon và có thể chế biến theo nhiều cách khác nhau. Khi kết hợp với các loại thực phẩm khác thì các món ăn từ táo sẽ càng đa dạng, phong phú, mang đến hương vị thơm ngon, hấp dẫn mà vẫn đảm bảo giá trị dinh dưỡng.\n" +
                "\n" +
                "Dưới đây là những lợi ích của quả táo:\n" +
                "\n" +
                "- Tăng cường hoạt động của hệ tiêu hóa:\n" +
                "\n" +
                "Táo có chứa nhiều chất xơ nên rất tốt cho hệ tiêu hóa. Đặc biệt trong loại quả này còn có chứa pectin (ở phần vỏ táo) có thể bảo vệ những lợi khuẩn và axit lactic trong ruột kết, giúp chúng hoạt động hiệu quả hơn. Đồng thời pectin còn có thể giúp cơ thể loại bỏ độc tố và giảm nguy cơ gây ung thư."));
        phoTos.add(new PhoTo(2,"https://product.hstatic.net/200000460455/product/1_d92d0152051c4519980e11bcea5d27c7_master.png","Dưa Hấu","Dưa hấu (tên khoa học là Citrullus lanatus) là một loài thực vật thuộc họ Cucurbitaceae, một loài thực vật có hoa giống như cây nho có nguồn gốc từ khu Tây Phi. Nó được trồng để lấy quả. Dưa hấu (Citrullus lanatus) là một loài dây leo xoắn và dài trong họ thực vật có hoa Cucurbitaceae. Có bằng chứng từ hạt giống dưa hấu trong những ngôi mộ Pharaoh ở Ai Cập cổ đại. Dưa hấu được trồng ở vùng nhiệt đới và cận nhiệt đới khu vực trên toàn thế giới để lấy quả ăn, là một loại quả đặc biệt của quả mọng với một vỏ cứng và không có sự phân chia trong quả, thực vật học gọi là pepo. Thịt ngọt, mọng nước, thường có màu đỏ đậm đến màu hồng, với nhiều hạt màu đen, mặc dù các giống dưa không hạt cũng đã được tạo ra. Trái có thể được ăn sống hoặc chế biến, vỏ có thể ăn được sau khi nấu. Nỗ lực lai trồng đã tạo ra các giống dưa hấu kháng bệnh. Nhiều giống cây dưa hấu có thể cho quả trưởng thành trong vòng 100 ngày kể từ khi gieo trồng."));
        phoTos.add(new PhoTo(3,"https://salt.tikicdn.com/ts/product/68/9e/4f/c0139b57a9b3a3e4403a6d199577d90c.jpg","Mận","Mận rất ngon"));
        phoTos.add(new PhoTo(4,"https://znews-photo.zingcdn.me/w660/Uploaded/sgorvz/2016_06_14/qua_xoai_1.jpg","Xoài","Xoài có hai loại theo vị là vị chua và vị ngọt"));
        phoTos.add(new PhoTo(5,"https://foody24h.com/assets/images/products/1625412906XcjudlHo.png","Măng cụt","Măng cụt có giá hơi đắt"));
        phoTos.add(new PhoTo(6,"https://familyfruits.com.vn/wp-content/uploads/2023/02/11.jpg","Nho","Nho thì quá vip"));
        phoTos.add(new PhoTo(7,"https://image.bnews.vn/MediaUpload/Org/2021/02/01/14.jpg","Quất","Quất được chưng chủ yếu vào ngày Tết"));
        phoTos.add(new PhoTo(8,"https://storage.googleapis.com/leep_app_website/2020/12/euJw084A-an-qua-mang-cau-ta-dung-cach.jpg","Mãng cầu","Mãng cầu khá dễ trồng nhưng dễ hư hỏng"));
        return phoTos;

//        String json = null;
//        try {
//            InputStream inputStream = getAssets().open("events.json");
//            int size = inputStream.available();
//            byte[] buffer = new byte[size];
//            inputStream.read(buffer);
//            inputStream.close();
//            json = new String(buffer, "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return  phoTos;
    }
    public static  PhoTo GetbyId(int id){
        for (int i=0;i<phoTos.size();i++){
            if(phoTos.get(i).getId_photo()==id){
                return phoTos.get(i);
            }
        }
        return null;
    }
}
