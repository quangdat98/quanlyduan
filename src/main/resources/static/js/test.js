

$(document).ready(function(){
    $("#up").hide();
});
var checkValid = {
    init : function () {
        checkValid.test();
    },
    test : function () {
        $(document).ready(function () {
            $(document).delegate('#button1','click',function () {
                $('#button1').prop('disable',true);
                var data = $('#inputEmail4').val();
                if (data.length ==0){
                    $("#up").show();
                    return false;
                }

                else
                    $('#button1').prop('disable',false);
                    return true;
            });

        });
    }
}
checkValid.init();

function sup() {
    $("#up").hide();
}