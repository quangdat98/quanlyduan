$(document).ready(function(){
    $("#inlineFormCheck").change(function(){
        $('#input11').val(0);
        $('#input11').attr('readonly', true);
        $('#full').val("");
        $('#email').val("");
        $('#user').val("");
    })
})