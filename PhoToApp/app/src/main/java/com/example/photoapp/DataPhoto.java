package com.example.photoapp;

import java.util.ArrayList;

public class DataPhoto {
   public static ArrayList<PhoTo> phoTos = new ArrayList<>();
    public static ArrayList<PhoTo>GetData(){
        phoTos.add(new PhoTo(1,"https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/NSW_seabed_1.JPG/330px-NSW_seabed_1.JPG","Táo","Quả táo có chứa rất nhiều dưỡng chất có lợi cho sức khỏe của bạn chẳng hạn như Carb, chất xơ, đường, chất béo, vitamin C, kali, magie,… Tuy cung cấp nhiều dinh dưỡng nhưng một quả táo chỉ có chứa 52 calo.\n" +
                "\n" +
                "Bên cạnh đó, một lý do khiến nhiều người lựa chọn loại quả này đó là thơm ngon và có thể chế biến theo nhiều cách khác nhau. Khi kết hợp với các loại thực phẩm khác thì các món ăn từ táo sẽ càng đa dạng, phong phú, mang đến hương vị thơm ngon, hấp dẫn mà vẫn đảm bảo giá trị dinh dưỡng.\n" +
                "\n" +
                "Dưới đây là những lợi ích của quả táo:\n" +
                "\n" +
                "- Tăng cường hoạt động của hệ tiêu hóa:\n" +
                "\n" +
                "Táo có chứa nhiều chất xơ nên rất tốt cho hệ tiêu hóa. Đặc biệt trong loại quả này còn có chứa pectin (ở phần vỏ táo) có thể bảo vệ những lợi khuẩn và axit lactic trong ruột kết, giúp chúng hoạt động hiệu quả hơn. Đồng thời pectin còn có thể giúp cơ thể loại bỏ độc tố và giảm nguy cơ gây ung thư."));
        phoTos.add(new PhoTo(2,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Citrullus_lanatus5SHSU.jpg/420px-Citrullus_lanatus5SHSU.jpg","Dưa Hấu","Dưa hấu (tên khoa học là Citrullus lanatus) là một loài thực vật thuộc họ Cucurbitaceae, một loài thực vật có hoa giống như cây nho có nguồn gốc từ khu Tây Phi. Nó được trồng để lấy quả. Dưa hấu (Citrullus lanatus) là một loài dây leo xoắn và dài trong họ thực vật có hoa Cucurbitaceae. Có bằng chứng từ hạt giống dưa hấu trong những ngôi mộ Pharaoh ở Ai Cập cổ đại. Dưa hấu được trồng ở vùng nhiệt đới và cận nhiệt đới khu vực trên toàn thế giới để lấy quả ăn, là một loại quả đặc biệt của quả mọng với một vỏ cứng và không có sự phân chia trong quả, thực vật học gọi là pepo. Thịt ngọt, mọng nước, thường có màu đỏ đậm đến màu hồng, với nhiều hạt màu đen, mặc dù các giống dưa không hạt cũng đã được tạo ra. Trái có thể được ăn sống hoặc chế biến, vỏ có thể ăn được sau khi nấu. Nỗ lực lai trồng đã tạo ra các giống dưa hấu kháng bệnh. Nhiều giống cây dưa hấu có thể cho quả trưởng thành trong vòng 100 ngày kể từ khi gieo trồng."));
        phoTos.add(new PhoTo(3,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Plums_African_Rose_-_whole%2C_halved_and_slice.jpg/330px-Plums_African_Rose_-_whole%2C_halved_and_slice.jpg","Mận","//"));
        phoTos.add(new PhoTo(4,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Mango_and_cross_section_edit.jpg/330px-Mango_and_cross_section_edit.jpg","Xoài","//"));
        phoTos.add(new PhoTo(5,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flowers_and_fruit_of_the_mangosteen%2C_and_Singapore_monkey%2C_by_Marianne_North.jpg/330px-Flowers_and_fruit_of_the_mangosteen%2C_and_Singapore_monkey%2C_by_Marianne_North.jpg","Măng cụt","//"));
        phoTos.add(new PhoTo(6,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Sauvignon_blanc_vlasotince_vineyards.jpg/450px-Sauvignon_blanc_vlasotince_vineyards.jpg","Nho","//"));
        phoTos.add(new PhoTo(7,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/M%E1%BB%99t_c%C3%A0nh_qu%E1%BA%A5t.jpg/330px-M%E1%BB%99t_c%C3%A0nh_qu%E1%BA%A5t.jpg","Quất","//"));
        phoTos.add(new PhoTo(8,"https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Atemola_%28cross_of_Annona_cherimola_and_Annona_squamosa%29.jpg/375px-Atemola_%28cross_of_Annona_cherimola_and_Annona_squamosa%29.jpg","Mãng cầu","//"));
        return phoTos;
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
