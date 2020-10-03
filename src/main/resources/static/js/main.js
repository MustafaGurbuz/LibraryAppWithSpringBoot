$(document).ready(function () {

    $('.nBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();

        if(text === "Edit"){
            $.get(href, function (book, status) {

                $('.myForm #id').val(book.id);
                $('.myForm #bookName').val(book.bookName);
                $('.myForm #bookAuthorName').val(book.bookAuthorName);
                $('.myForm #bookSerialNumber').val(book.bookSerialNumber);
                $('.myForm #publisher').val(book.publisher);
            });
            $('.myForm #exampleModal').modal();
        }else{
            $('.myForm #id').val();
            $('.myForm #bookName').val();
            $('.myForm #bookAuthorName').val();
            $('.myForm #bookSerialNumber').val();
            $('.myForm #publisher').val();
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();
    });

});