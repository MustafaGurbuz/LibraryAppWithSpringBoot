package com.kodzamani.libraryprojectwithdb;

import com.kodzamani.libraryprojectwithdb.dataBaseVariables.Books;
import com.kodzamani.libraryprojectwithdb.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AllData  implements CommandLineRunner {

    @Autowired
    public BooksRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {
        bookRepo.save(new Books("Chess","Stefan Zweig"
                ,"1590171691","Can Yayinlari"));
        bookRepo.save(new Books("Yer Altından Notlar","Dostoyevski"
                ,"0451529553","Şafak Yayinlari"));
        bookRepo.save(new Books("Olasılıksız","Adam Fawer"
                ,"9756006056","April Yayinlari"));
        bookRepo.save(new Books("Kiralık Konak","Y.Kadri Karaosmanoğlu"
                ,"9754700087","İletişim Yayıncılık"));
        bookRepo.save(new Books("Simyacı","Paul Guelho"
                ,"9755106820","İletişim Yayinlari"));
        bookRepo.save(new Books("1984","George Orwell"
                ,"9789750718","Göz  Yayinlari"));
        bookRepo.save(new Books("Cesur Yeni Dünya","Aldous Huxley"
                ,"0060929871 ","Papatya  Yayıncılık"));
        bookRepo.save(new Books("Karamazov Kardeşler","Dostoyevski"
                ,"0374528373","Güneş Yayinlari"));
        bookRepo.save(new Books("Yaprak Dökümü","Reşat Nuri Güntekin"
                ,"9751001358","Inkilab Kitabevi"));
        bookRepo.save(new Books("Tutunamayanlar","Oğuz Atay"
                ,"9789754700114","İletişim  Yayinlari"));
    }
}
