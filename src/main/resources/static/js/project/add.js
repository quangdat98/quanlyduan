$(document).ready(function(){
    $("#inlineFormCheck").change(function(){
        $('#full').val("");
        $('#email').val("");
        $('#user').val(0);
        $('#inlineFormCheck').prop("checked",true);
    })
})