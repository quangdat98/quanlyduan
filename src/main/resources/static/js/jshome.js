/*
var data1 = $('#message').val();

if (data.length ==0){
    alert('Insert Success!');
}
else
    alert('Insert Not Success!');

*/

$(document).ready(function(){
    $("#up").hide();
    $(document).ready(function () {
        $('.removeId').off('click').on('click',function (e) {
            e.preventDefault();
            var id = $(this).data("id");
            $('#deleteOk').val(id);
            $('#up').show();


        });

        $('#deleteOk').on('click',function () {
            var id = $(this).val();
            window.location.href='/delete/'+id;
            $("#up").hide();
        });
    });
});


/*
function deleteSoluton(id) {
    alert('3423');
    $("#up").show();
    $('#idsu').val(id);
}


function ok() {
    var dataId = $('#idsu').val();
    window.location.href='/delete/'+dataId;
}
*/

function sup() {
    $("#up").hide();
}