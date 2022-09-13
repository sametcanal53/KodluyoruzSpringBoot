package com.sametcanal.security.jwt;

public class _00_Information {
    // JWT = Json Web Token
    // Web servis güvenliği,kullanıcı doğrulamaıs
    // authentication -> login/register
    // authorization -> sisteme giriş yetkisi kontrolu
    // JWT RFC7519 endüstri standartı

    // 1 - Header
    // Header(Başlık)+Payload(Veri)+Signature(imza)
    // Algoritma : HS256 , HMAC,SHA256,RSA
    // Encoder,decoder

    // 2- Payload
    // iss
    // exp
    // sub

    // Yararları
    // JSON Formatı
    // Cookie kullanmaya gerek yoktur.
    // Doğrulama için database bağlantısına gerek yoktur.
    // Stateless (Session Yoktur)
}
